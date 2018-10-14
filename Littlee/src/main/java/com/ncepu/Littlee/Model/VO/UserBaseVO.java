package com.ncepu.Littlee.Model.VO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Common.handleLIst;
import com.ncepu.Littlee.Mapper.SchoolMapper;
import com.ncepu.Littlee.Model.School;
import com.ncepu.Littlee.Model.User;

//用户基本信息
public class UserBaseVO  {

	public UserBaseVO(User user) {
		if (user == null)
			return;
		this.id = user.getId();
		this.nickname = user.getNickname();
		this.icon = user.getIcon();
		this.sex = user.getSex();
		this.followUserCount = handleLIst.getCount(user.getFollowUser());
		this.userFollowedCount = handleLIst.getCount(user.getUserFollowed());
		this.cardCount = handleLIst.getCount(user.getCards());
		this.major = user.getMajor();
		this.introduction = user.getIntroduction();
		this.level = user.getLevel();
		this.cardsList = handleLIst.getList(user.getCards());
	}

	private Integer id;
	private String nickname;
	private String icon;// 头像
	private Integer sex;// 0为女 1为男 2为保密
	private Integer followUserCount;// 关注人数
	private Integer userFollowedCount;// 关注他的人数
	private Integer cardCount;// 帖子数量
	private String major;// 专业
	private String school;
	private String introduction;// 个人简介
	private Integer level;
	private List<Integer> cardsList;// 最近帖子列表
	// 0=超级管理
	// 1=管理员
	// 2=官方号
	// 3=团体号
	// 4=教师号
	// 5=学生号
	// 6=广告推广号
	// 7=未认证账号

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getFollowUserCount() {
		return followUserCount;
	}

	public void setFollowUserCount(Integer followUserCount) {
		this.followUserCount = followUserCount;
	}

	public Integer getUserFollowedCount() {
		return userFollowedCount;
	}

	public void setUserFollowedCount(Integer userFollowedCount) {
		this.userFollowedCount = userFollowedCount;
	}

	public Integer getCardCount() {
		return cardCount;
	}

	public void setCardCount(Integer cardCount) {
		this.cardCount = cardCount;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<Integer> getCardsList() {
		return cardsList;
	}

	public void setCardsList(List<Integer> cardsList) {
		this.cardsList = cardsList;
	}

}
