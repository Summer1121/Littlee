package com.ncepu.Littlee.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncepu.Littlee.Service.SchoolService;
import net.sf.json.JSONObject;

@Controller
public class SchollController {
	@Autowired
	SchoolService schoolService;

	// 获取学校信息
	@RequestMapping("/message/school/getinfo/**")
	@ResponseBody
	public JSONObject UserMessage(HttpServletRequest request) throws IOException {
		JSONObject jsRes = schoolService.getSchool(request);
		System.out.println(new Date());
		return jsRes;
	}
}
