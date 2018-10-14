package com.ncepu.Littlee.Model.VO;

import java.sql.Timestamp;
import java.util.List;

import com.ncepu.Littlee.Common.handleLIst;
import com.ncepu.Littlee.Model.Card;
import com.ncepu.Littlee.Model.Comment;

import clojure.string__init;

//帖子一级显示
public class CardVO {
	public CardVO(Card card) {
		this.id = card.getId();
		this.topicId = card.getTopicId();
		this.title = card.getTitle();
		this.zanCount = handleLIst.getCount(card.getZan());
		this.userId = card.getUserId();
		this.time = card.getTime();
		this.content = card.getContent();
	}

	private Integer id;

	private Integer topicId;

	private String title;

	private Integer zanCount;

	private Integer userId;

	private String icon;// 在service中实现

	private String time;

	private String content;

	private List<CommentVO> comments;//帖子下的评论

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

	public Integer getZanCount() {
		return zanCount;
	}

	public void setZanCount(Integer zanCount) {
		this.zanCount = zanCount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<CommentVO> getComments() {
		return comments;
	}

	public void setComments(List<CommentVO> comments) {
		this.comments = comments;
	}

}
