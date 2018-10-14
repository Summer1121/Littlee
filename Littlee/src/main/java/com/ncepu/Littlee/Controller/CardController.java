package com.ncepu.Littlee.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncepu.Littlee.Service.CardService;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/message/card/")
public class CardController {
	@Autowired
	CardService cardService;

	// 获取帖子信息
	@RequestMapping("/getinfo/**")
	@ResponseBody
	public JSONObject cardMessage(HttpServletRequest request) throws IOException {
		JSONObject jsRes = cardService.getCard(request);
		System.out.println(new Date());
		return jsRes;
	}

	@RequestMapping("/getcard/**")
	@ResponseBody
	public JSONObject getcard(HttpServletRequest request) throws IOException {
		JSONObject jsRes=cardService.getCard(request);
		System.out.println(new Date());
		return jsRes;
	}
}
