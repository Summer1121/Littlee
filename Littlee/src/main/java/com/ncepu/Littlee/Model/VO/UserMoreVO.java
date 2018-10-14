package com.ncepu.Littlee.Model.VO;

import com.ncepu.Littlee.Model.User;

//用户更多信息
public class UserMoreVO {

	public UserMoreVO(User user) {
		if (user == null)
			return;
		this.num = user.getNum();
		this.name = user.getName();
		this.email = user.getEmail();
		this.phone = user.getPhone();
		this.birthday = user.getBirthday();
		this.classIn = user.getClassIn();
		this.hometown = user.getHometown();
	}

	private String num;// 学号
	private String name;
	private String email;
	private String phone;
	private String birthday;
	private String classIn;
	private String hometown;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getClassIn() {
		return classIn;
	}

	public void setClassIn(String classIn) {
		this.classIn = classIn;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

}
