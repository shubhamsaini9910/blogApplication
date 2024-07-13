  package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import com.blog.entities.Role;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter

public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message ="Username must be min of 4 characters  !!")
	private String name;
	
	@Email(message="Email address is not valid !!")
	private String email;
	
	@NotNull
	@Size(min = 4, max = 10 , message ="Password must be min of 3 chars and max of 10 chars !!")
	private String password;
	
	@NotNull
	private String about;

	private Set<RoleDto> roles = new HashSet<>();
}
