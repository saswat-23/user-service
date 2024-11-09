package site.s23.userlisting.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import site.s23.userlisting.model.User;

//@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class UserRespDTO extends UserDTO{
	
	public UserRespDTO(User user) {
		super(user.getUserId(), user.getUsername(), user.getFirstName(), user.getLastName(), user.getAddress());
		this.isActive = user.isActive();
	}
	
	boolean isActive;
}
