package site.s23.userlisting.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.s23.userlisting.dto.UserDTO;
import site.s23.userlisting.model.User;
import site.s23.userlisting.repo.UserRepo;
import site.s23.userlisting.utility.UserUtility;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public UserDTO getUserById(int userId) {
		
		UserDTO userDTO = UserUtility.getUserDTOFromUserEntity(userRepo.findById(userId).get(),new UserDTO());
		
		return userDTO;
	}
	
	public List<UserDTO> fetchAllUsers(){
		
		List<User> users = userRepo.findAll();
		
		return users.stream().map(user -> UserUtility.getUserDTOFromUserEntity(user,new UserDTO())).collect(Collectors.toList());
		
	}
	
	public UserDTO addNewUser(UserDTO userDTO){
		
		User user = userRepo.save(UserUtility.getUserEntityFromUserDTO(userDTO, new User()));
		return UserUtility.getUserDTOFromUserEntity(user, new UserDTO());
	}
	
	
	public UserDTO updateUser(UserDTO userDTO){
		
		if(getUserById(userDTO.getUserId()) != null) {
			System.out.println("No user found with userId = "+userDTO.getUserId());
		}
		
		
		User user = userRepo.save(UserUtility.getUserEntityFromUserDTO(userDTO, new User()));
		return UserUtility.getUserDTOFromUserEntity(user, new UserDTO());
	}
	
}
