package com.ncepu.Littlee.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.SchoolMapper;
import com.ncepu.Littlee.Model.School;

import net.sf.json.JSONObject;

@Service
public class SchoolService {
	@Autowired
	SchoolMapper schoolMapper;

	public JSONObject getSchool(HttpServletRequest request) throws IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		School school = schoolMapper.selectById(id);
		JSONObject jsonObject = JSONObject.fromObject(school);
		return jsonObject;
	}
}
