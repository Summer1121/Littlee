package com.ncepu.Littlee.Model.VO;

import java.sql.Timestamp;

import com.ncepu.Littlee.Model.Reply;

//回复内容
public class ReplyVO {
	
	
	public ReplyVO(Reply reply) {
		super();
		this.id = reply.getId();
		this.cardId = reply.getCardId();
		this.commentId = reply.getCommentId();
		this.replyToUserId = reply.getReplyToUserId();
		this.fromId = reply.getFromId();
		this.time = reply.getTime();
		this.content = reply.getContent();
	}

	private Integer id;

	private Integer cardId;

	private Integer commentId;// 所在评论

	private Integer replyToUserId;// 回复对象

	private Integer fromId;// 回复人

	private String time;

	private String content;
	
	
	

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

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getReplyToUserId() {
		return replyToUserId;
	}

	public void setReplyToUserId(Integer replyToUserId) {
		this.replyToUserId = replyToUserId;
	}

	public Integer getFromId() {
		return fromId;
	}

	public void setFromId(Integer fromId) {
		this.fromId = fromId;
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

}
