package com.ncepu.Littlee.Mapper;

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

import com.ncepu.Littlee.Model.Card;

@Mapper
public interface CardMapper {
	@Delete({ "delete from card where id = #{id,jdbcType=INTEGER}" })
	int deleteById(Integer id);

	@Insert({ "insert into card (id, topic_id, ", "title, zan, user_id, ", "time, content)",
			"values (#{id,jdbcType=INTEGER}, #{topicId,jdbcType=INTEGER}, ",
			"#{title,jdbcType=VARCHAR}, #{zan,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
			"#{time,jdbcType=TIMESTAMP}, #{content,jdbcType=LONGVARCHAR})" })
	int insert(Card card);

	@Select({ "select * from card", "where id = #{id,jdbcType=INTEGER}" })
	Card selectById(Integer id);

	@Update({ "update card", "set title = #{title,jdbcType=VARCHAR},", "zan = #{zan,jdbcType=VARCHAR},",
			"user_id = #{userId,jdbcType=INTEGER},", "time = #{time,jdbcType=TIMESTAMP},",
			"content = #{content,jdbcType=LONGVARCHAR}", "topic_id = #{topicId,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateById(Card card);

}