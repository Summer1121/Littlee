package com.ncepu.Littlee.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.ncepu.Littlee.Model.Comment;


@Mapper
public interface CommentMapper {
	@Delete({ "delete from comment", "where id = #{id,jdbcType=INTEGER}", "and card_id = #{cardId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id, Integer cardId);

	@Insert({ "insert into comment (id, card_id, ", "time, content)",
			"values (#{id,jdbcType=INTEGER}, #{cardId,jdbcType=INTEGER}, ",
			"#{time,jdbcType=TIMESTAMP}, #{content,jdbcType=LONGVARCHAR})" })
	int insert(Comment comment);

	@Select({ "select * from comment", "where id = #{id,jdbcType=INTEGER}",
			"and card_id = #{cardId,jdbcType=INTEGER}" })
	Comment selectByPrimaryKey(Integer id, Integer cardId);
	
	@Select({"select * from comment where card_id=#{cardId,jdbcType=INTEGER}"})
	List<Comment> selectByCardId(Integer cardId);

	@Update({ "update comment", "set time = #{time,jdbcType=TIMESTAMP},", "content = #{content,jdbcType=LONGVARCHAR}",
			"where id = #{id,jdbcType=INTEGER}", "and card_id = #{cardId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Comment record);
}