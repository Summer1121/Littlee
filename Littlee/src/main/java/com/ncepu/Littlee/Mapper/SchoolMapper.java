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

import com.ncepu.Littlee.Model.School;

@Mapper
public interface SchoolMapper {
	@Delete({ "delete from school", "where id = #{id,jdbcType=INTEGER}" })
	int deleteById(Integer id);

	@Insert({ "insert into school (id, name)", "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR})" })
	int insert(School schllo);

	@Select({ "select * from school", "where id = #{id,jdbcType=INTEGER}" })
	School selectById(Integer id);

	@Update({ "update school", "set name = #{name,jdbcType=VARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
	int updateById(School school);
}