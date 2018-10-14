package com.ncepu.Littlee.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncepu.Littlee.Service.CommentService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/message/comment/")
public class CommentController {
	@Autowired
	CommentService commentService;

	// 获取评论信息
	@RequestMapping("/getinfo/**")
	@ResponseBody
	public JSONObject UserMessage(HttpServletRequest request) throws IOException {
		JSONObject jsRes = commentService.getComment(request);
		System.out.println(new Date());
		return jsRes;
	}
}
