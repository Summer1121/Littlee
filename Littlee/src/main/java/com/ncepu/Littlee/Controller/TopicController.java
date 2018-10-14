package com.ncepu.Littlee.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncepu.Littlee.Service.TopicSevice;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/message/topic/")
public class TopicController {
	@Autowired
	TopicSevice topicSevice;

	// 获取话题信息
	@RequestMapping("/getinfo/**")
	@ResponseBody
	public JSONObject UserMessage(HttpServletRequest request) throws IOException {
		JSONObject jsRes = topicSevice.getTopic(request);
		System.out.println(new Date());
		return jsRes;
	}
}
