package com.ncepu.Littlee.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.CommentMapper;
import com.ncepu.Littlee.Model.Comment;

import net.sf.json.JSONObject;

@Service
public class CommentService {
	@Autowired
	CommentMapper commentMapper;

	public JSONObject getComment(HttpServletRequest request) throws IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		Integer cardId = Integer.valueOf(request.getParameter("cardId"));
		Comment comment = commentMapper.selectByPrimaryKey(id, cardId);
		JSONObject jsonObject = JSONObject.fromObject(comment);
		return jsonObject;
	}
}
