package site.s23.userlisting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	int userId;
	String username;
	String firstName;
	String lastName;
	String password;
	String address;
	boolean isActive;
	
}
