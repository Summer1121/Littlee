package com.ncepu.Littlee.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.TopicMapper;
import com.ncepu.Littlee.Model.Topic;

import net.sf.json.JSONObject;

@Service
public class TopicSevice {

	@Autowired
	TopicMapper topicMapper;

	public JSONObject getTopic(HttpServletRequest request) throws IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		Topic topic = topicMapper.selectById(id);
		JSONObject jsonObject = JSONObject.fromObject(topic);
		return jsonObject;
	}
}
