package com.ncepu.Littlee.Model.VO;

import java.sql.Timestamp;
import java.util.List;

import com.ncepu.Littlee.Model.Comment;
import com.ncepu.Littlee.Model.Reply;

//评论的展示数据
public class CommentVO {
	private Integer id;

	public CommentVO(Comment comment) {
		this.id = comment.getId();
		this.cardId = comment.getCardId();
		this.time = comment.getTime();
		this.content = comment.getContent();
		this.userId = comment.getUserId();
	}

	private Integer cardId;

	private String time;

	private String content;

	private Integer userId;

	private List<Reply> replyList;//在service中实现

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Reply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}

}
