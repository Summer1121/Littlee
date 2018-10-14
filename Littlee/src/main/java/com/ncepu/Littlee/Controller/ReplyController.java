package com.ncepu.Littlee.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncepu.Littlee.Service.ReplyService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/message/reply/")
public class ReplyController {
	@Autowired
	ReplyService replyService;

	// 获取回复信息
	@RequestMapping("/getinfo/**")
	@ResponseBody
	public JSONObject UserMessage(HttpServletRequest request) throws IOException {
		JSONObject jsRes = replyService.getReply(request);
		System.out.println(new Date());
		return jsRes;
	}
}
