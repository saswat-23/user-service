package site.s23.userlisting.utility;

import site.s23.userlisting.dto.UserDTO;
import site.s23.userlisting.dto.UserReqDTO;
import site.s23.userlisting.dto.UserRespDTO;
import site.s23.userlisting.model.User;

public class UserUtility {

	/**
	 * Updates the UserEntity with the values present in the UserDTO
	 * @param userDTO
	 * @param userEntity
	 * @return
	 */
	public static User getUserEntityFromUserDTO(final UserReqDTO userDTO, User userEntity) {
		userEntity = new User(userDTO.getUserId(), userDTO.getUsername(), userDTO.getFirstName(), userDTO.getLastName(),
					userDTO.getPassword(), userDTO.getAddress(), userDTO.isActive());
		return userEntity; 
	}

	/**
	 * Updates the UserDTO with the values present in the UserEntity
	 * @param user
	 * @param userDTO
	 * @return
	 */
	public static UserRespDTO getUserDTOFromUserEntity(final User user, UserRespDTO userDTO) {
		userDTO = new UserRespDTO(user);
		return userDTO; 
	}
		
}
