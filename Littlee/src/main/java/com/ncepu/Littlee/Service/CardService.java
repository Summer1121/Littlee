package com.ncepu.Littlee.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.Littlee.Mapper.CardMapper;
import com.ncepu.Littlee.Mapper.CommentMapper;
import com.ncepu.Littlee.Mapper.UserMapper;
import com.ncepu.Littlee.Model.Card;
import com.ncepu.Littlee.Model.Comment;
import com.ncepu.Littlee.Model.VO.CardVO;
import com.ncepu.Littlee.Model.VO.CommentVO;

import net.sf.json.JSONObject;

@Service
public class CardService {
	@Autowired
	CardMapper cardMapper;

	@Autowired
	UserMapper userMapper;

	@Autowired
	CommentMapper commentMapper;

//	public JSONObject getCard(HttpServletRequest request) throws IOException {
//		request.setCharacterEncoding("UTF-8");
//		Integer id = Integer.valueOf(request.getParameter("id"));
//		Card card = cardMapper.selectById(id);
//		JSONObject jsonObject = JSONObject.fromObject(card);
//		return jsonObject;
//	}

	// 显示一个帖子
	public JSONObject getCard(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("UTF-8");
		Integer id = Integer.parseInt(request.getParameter("id"));
		Card card = null;
		String icon = null;
		CardVO cardVO = null;
		JSONObject jsonObject = null;
		List<CommentVO> commentList = new ArrayList<>();// 评论列表
		try {
			// 分别从uesr表和comment查出相关内容封装进cardVO
			card = cardMapper.selectById(id);
			icon = userMapper.selectById(card.getUserId()).getIcon();
			List<Comment> comments = commentMapper.selectByCardId(card.getId());
			cardVO = new CardVO(card);
			cardVO.setIcon(icon);
			for (Comment com : comments) {
				commentList.add(new CommentVO(com));
			}
			cardVO.setComments(commentList);
			jsonObject = JSONObject.fromObject(cardVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
}
