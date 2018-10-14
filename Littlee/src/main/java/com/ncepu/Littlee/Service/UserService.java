package com.ncepu.Littlee.Service;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.SchoolMapper;
import com.ncepu.Littlee.Mapper.UserMapper;
import com.ncepu.Littlee.Model.User;
import com.ncepu.Littlee.Model.VO.UserBaseVO;
import com.ncepu.Littlee.Model.VO.UserMoreVO;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	@Autowired
	SchoolMapper schoolMapper;

	// 返回全部信息
	public JSONObject getUser(HttpServletRequest request) throws IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		User user = userMapper.selectById(id);
		JSONObject jsonObject = JSONObject.fromObject(user);
		return jsonObject;
	}

	// 返回基本信息
	public JSONObject getBaseInfo(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		UserBaseVO userBaseVO = null;
		JSONObject jsonObject = null;
		User user = null;
		try {
			user = userMapper.selectById(id);
			userBaseVO = new UserBaseVO(user);
			userBaseVO.setSchool(schoolMapper.selectById(user.getSchoolId()).getName());
			jsonObject = JSONObject.fromObject(userBaseVO);

		} catch (Exception e) {
			e.printStackTrace();
			if (jsonObject == null) {
				System.out.println("js NULL");
			}
		}
		return jsonObject;
	}

	// 返回更多信息
	public JSONObject getMoreInfo(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		UserMoreVO userMoreVO = null;
		JSONObject jsonObject = null;
		User user = null;
		try {
			user = userMapper.selectById(id);
			userMoreVO = new UserMoreVO(user);
			jsonObject = JSONObject.fromObject(userMoreVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
}
