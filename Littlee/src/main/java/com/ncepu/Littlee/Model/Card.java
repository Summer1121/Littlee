package com.ncepu.Littlee.Model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Card {
	private Integer id;

	private Integer topicId;

	private String title;

	private String zan;

	private Integer userId;

	private Timestamp time;

	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getZan() {
		return zan;
	}

	public void setZan(String zan) {
		this.zan = zan;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

	public String getTime() {
		return simpleDateFormat.format(time);
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}