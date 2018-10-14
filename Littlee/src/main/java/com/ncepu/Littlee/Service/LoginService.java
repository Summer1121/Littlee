package com.ncepu.Littlee.Service;

import java.lang.Thread.State;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.UserMapper;
import com.ncepu.Littlee.Model.User;
import com.ncepu.Littlee.Model.VO.LoginVO;

import net.sf.json.JSONObject;

//用于登录验证
@Service
public class LoginService {
	LoginVO loginVO;
	@Autowired
	UserMapper userMapper;

	public JSONObject check(HttpServletRequest request) {
		String id = request.getParameter("id");// 此处id可为id、邮箱、手机号之一
		String password = request.getParameter("password");
		JSONObject jsRes = new JSONObject();
		User user=null;
		try {
			user=userMapper.selectForLogin(id, password);
			loginVO = new LoginVO(user);// 将查询出的结果封装为LoginVO对象
		} finally {
			if (user==null) {
				jsRes.put("Status", "401");//没查询到相关账户  状态码 401
			} else {
				jsRes.put("Status", "200");//登陆成功，返回用户id  状态码 200
				jsRes.put("id", loginVO.getId());
			}
		}
		return jsRes;
	}

}
