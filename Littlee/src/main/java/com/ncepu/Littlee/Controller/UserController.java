package com.ncepu.Littlee.Controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncepu.Littlee.Model.VO.LoginVO;
import com.ncepu.Littlee.Service.LoginService;
import com.ncepu.Littlee.Service.UserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/message/user/")
public class UserController {
	@Autowired
	UserService userService;

//	// 获取用户信息
//	@RequestMapping("/getinfo/**")
//	@ResponseBody
//	public JSONObject UserMessage(HttpServletRequest request) throws IOException {
//		request.setCharacterEncoding("UTF-8");
//		JSONObject jsRes = userService.getUser(request);
//		System.out.println(new Date());
//		return jsRes;
//	}

	@Autowired
	LoginService loginService;

	// 用户登录验证
	@RequestMapping("/check/**")
	@ResponseBody
	public JSONObject userCheck(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("UTF-8");
		JSONObject jsRes = loginService.check(request);
		return jsRes;
	}

	//获取哟怒胡基本信息
	@RequestMapping("/getbase/**")
	@ResponseBody
	public JSONObject userBaseInfo(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("UTF-8");
		JSONObject jsRes = userService.getBaseInfo(request);
		System.out.println(new Date());
		return jsRes;
	}

	//获取用户更多信息
	@RequestMapping("/getmore/**")
	@ResponseBody
	public JSONObject userMoreInfo(HttpServletRequest request)throws IOException{
		request.setCharacterEncoding("UTF-8");
		JSONObject jsRes=userService.getMoreInfo(request);
		System.out.println(new Date());
		return jsRes;
	}

}
