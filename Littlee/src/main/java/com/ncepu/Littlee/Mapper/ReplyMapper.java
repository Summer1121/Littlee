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

import com.ncepu.Littlee.Model.Reply;
@Mapper
public interface ReplyMapper {
	@Delete({ "delete from reply", "where id = #{id,jdbcType=INTEGER}", "and card_id = #{cardId,jdbcType=INTEGER}",
			"and comment_id = #{commentId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id, Integer carId, Integer commentId);

	@Insert({ "insert into reply (id, card_id, ", "comment_id, reply_to_user_id, ", "from_id, time, content)",
			"values (#{id,jdbcType=INTEGER}, #{cardId,jdbcType=INTEGER}, ",
			"#{commentId,jdbcType=INTEGER}, #{replyToUserId,jdbcType=INTEGER}, ",
			"#{fromId,jdbcType=INTEGER}, #{time,jdbcType=TIMESTAMP}, #{content,jdbcType=LONGVARCHAR})" })
	int insert(Reply reply);

	@Select({ "select * ", "from reply",
			"where id = #{id,jdbcType=INTEGER}", "and card_id = #{cardId,jdbcType=INTEGER}",
			"and comment_id = #{commentId,jdbcType=INTEGER}" })
	Reply selectByPrimaryKey(Integer id, Integer cardId, Integer commentId);

	@Update({ "update reply", "set reply_to_user_id = #{replyToUserId,jdbcType=INTEGER},",
			"from_id = #{fromId,jdbcType=INTEGER},", "time = #{time,jdbcType=TIMESTAMP},",
			"content = #{content,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=INTEGER}",
			"and card_id = #{cardId,jdbcType=INTEGER}", "and comment_id = #{commentId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Reply reply);
}