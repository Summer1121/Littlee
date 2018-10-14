package com.ncepu.Littlee.Model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
	private Integer id;

	private String password;

	private String num;

	private String name;

	private String nickname;

	private String email;

	private String phone;

	private Date birthday;

	private String major;

	private String classIn;

	private String introduction;

	private String hometown;

	private String icon;

	private Integer schoolId;

	private String followUser;

	private String followTopic;

	private String followCard;

	private String cards;

	private Integer sex;

	//0=超级管理
	//1=管理员
	//2=官方号
	//3=团体号
	//4=教师号
	//5=学生号
	//6=广告推广号
	//7=未认证账号
	private Integer level;

	private String userFollowed;

	
	
	
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	// 返回yyyy-MM-dd格式字符串
	public String getBirthday() {
		return simpleDateFormat.format(birthday);
	}

	public void setBirthday(Date birthday) throws ParseException {
		this.birthday = simpleDateFormat.parse(simpleDateFormat.format(birthday));
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getClassIn() {
		return classIn;
	}

	public void setClassIn(String classIn) {
		this.classIn = classIn;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getFollowUser() {
		return followUser;
	}

	public void setFollowUser(String followUser) {
		this.followUser = followUser;
	}

	public String getFollowTopic() {
		return followTopic;
	}

	public void setFollowTopic(String followTopic) {
		this.followTopic = followTopic;
	}

	public String getFollowCard() {
		return followCard;
	}

	public void setFollowCard(String followCard) {
		this.followCard = followCard;
	}

	public String getCards() {
		return cards;
	}

	public void setCards(String cards) {
		this.cards = cards;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getUserFollowed() {
		return userFollowed;
	}

	public void setUserFollowed(String userFollowed) {
		this.userFollowed = userFollowed;
	}

}