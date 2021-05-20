package com.sana.s1.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MemberVO {

	private String username;

	//최소 4글자 이상
	@Size(min = 4)
	private String password;

	@NotEmpty(message = "넌 이름이 없니??") //name은 null이 아니여야 한다는 의미
	private String name;

	@Email
	@NotEmpty
	private String email;
	private String phone;

	//0 이상 200이하
	@Max(value = 200)
	@Min(value = 0)
	private Integer age;
}
