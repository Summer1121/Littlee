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

import com.ncepu.Littlee.Model.Topic;
@Mapper
public interface TopicMapper {
	@Delete({ "delete from topic", "where id = #{id,jdbcType=INTEGER}" })
	int deleteById(Integer id);

	@Insert({ "insert into topic (id, name, ", "count, follow, introduction)",
			"values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
			"#{count,jdbcType=INTEGER}, #{follow,jdbcType=INTEGER}, #{introduction,jdbcType=VARCHAR})" })
	int insert(Topic topic);

	@Select({ "select * from topic", "where id = #{id,jdbcType=INTEGER}" })
	Topic selectById(Integer id);

	@Update({ "update topic", "set name = #{name,jdbcType=VARCHAR},", "count = #{count,jdbcType=INTEGER},",
			"follow = #{follow,jdbcType=INTEGER},", "introduction = #{introduction,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateById(Topic topic);
}