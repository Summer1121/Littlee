package com.ncepu.Littlee.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.ReplyMapper;
import com.ncepu.Littlee.Model.Reply;

import net.sf.json.JSONObject;

@Service
public class ReplyService {
	@Autowired
	ReplyMapper replyMapper;

//	public JSONObject getReply(HttpServletRequest request) throws IOException {
//
//		Integer id = Integer.valueOf(request.getParameter("id"));
//		Integer cardId = Integer.valueOf(request.getParameter("cardId"));
//		Integer commentId = Integer.valueOf(request.getParameter("id"));
//		Reply reply = replyMapper.selectByPrimaryKey(id, cardId, commentId);
//		JSONObject jsonObject = JSONObject.fromObject(reply);
//		return jsonObject;
//	}

	public JSONObject getReply(HttpServletRequest request) throws IOException {
		Integer id = Integer.parseInt(request.getParameter("cardId"));
		
	}
}
