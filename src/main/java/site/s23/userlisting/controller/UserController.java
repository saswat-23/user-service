package site.s23.userlisting.controller;

import java.util.List;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.s23.userlisting.dto.UserDTO;
import site.s23.userlisting.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/id/{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable int userId) {
		
		UserDTO userDTO = userService.getUserById(userId);
		return new ResponseEntity<>(userDTO, HttpStatusCode.valueOf(HttpStatus.SC_OK));
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<UserDTO>> getAllUsers() {
		List<UserDTO> users = userService.fetchAllUsers();
		return new ResponseEntity<>(users, HttpStatusCode.valueOf(HttpStatus.SC_OK));
	}
	
	@PostMapping("/add")
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
		UserDTO user = userService.addNewUser(userDTO);
		return new ResponseEntity<>(user, HttpStatusCode.valueOf(HttpStatus.SC_CREATED));
	}
	
	@PutMapping("/update")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
		UserDTO user = userService.addNewUser(userDTO);
		return new ResponseEntity<>(user, HttpStatusCode.valueOf(HttpStatus.SC_ACCEPTED));
	}
}
