package com.ncepu.Littlee.Model.VO;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.ncepu.Littlee.Model.User;

//用于登录的对象

public class LoginVO {

	public LoginVO(User user) {
		if (user == null)
			return;
		this.id = user.getId();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.phone = user.getPhone();
	}

	private Integer id;
	private String password;
	private String email;
	private String phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
