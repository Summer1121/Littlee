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

import com.ncepu.Littlee.Model.User;

import clojure.string__init;

@Mapper
public interface UserMapper {
	@Delete({ "delete from user", "where id = #{id,jdbcType=INTEGER}" })
	int deleteById(Integer id);

	@Insert({ "insert into user (id, password, ", "num, name, nickname, ", "email, phone, birthday, ",
			"major, class, introduction, ", "hometown, icon, ", "school_id, follow_user, ",
			"follow_topic, follow_card,cards,sex,level,user_followed)",
			"values (#{id,jdbcType=INTEGER}, #{password,jdbcType=VARCHAR}, ",
			"#{num,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
			"#{email,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{birthday,jdbcType=DATE}, ",
			"#{major,jdbcType=VARCHAR}, #{classIn,jdbcType=VARCHAR}, #{introduction,jdbcType=VARCHAR}, ",
			"#{hometown,jdbcType=VARCHAR}, #{icon,jdbcType=VARCHAR}, ",
			"#{schoolId,jdbcType=INTEGER}, #{followUser,jdbcType=LONGVARCHAR}, ",
			"#{followTopic,jdbcType=LONGVARCHAR}, #{followCard,jdbcType=LONGVARCHAR},#{cards,jdbcType=LONGVARCHAR},",
			"#{sex,jdbcType=INTEGER},#{level,jdbcType=INTEGER},#{user_followed,jdbcType=LONGVARCHAR})" })
	int insert(User user);

	@Select({ "select * ", "from user", "where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "class", property = "classIn") })
	User selectById(Integer id);

	@Update({ "update user", "set password = #{password,jdbcType=VARCHAR},", "num = #{num,jdbcType=VARCHAR},",
			"name = #{name,jdbcType=VARCHAR},", "nickname = #{nickname,jdbcType=VARCHAR},",
			"email = #{email,jdbcType=VARCHAR},", "phone = #{phone,jdbcType=VARCHAR},",
			"birthday = #{birthday,jdbcType=DATE},", "major = #{major,jdbcType=VARCHAR},",
			"class = #{classIn,jdbcType=VARCHAR},", "introduction = #{introduction,jdbcType=VARCHAR},",
			"hometown = #{hometown,jdbcType=VARCHAR},", "icon = #{icon,jdbcType=VARCHAR},",
			"school_id = #{schoolId,jdbcType=INTEGER},", "follow_user = #{followUser,jdbcType=LONGVARCHAR},",
			"follow_topic = #{followTopic,jdbcType=LONGVARCHAR},", "follow_card = #{followCard,jdbcType=LONGVARCHAR} ",
			"cards=#{cards,jdbcType=LONGVARCHAR}", "sex=#{sex,jdbcType=INTEGER}", "level=#{level,jdbcType=INTEGER}",
			"user_followed=#{userFollowed,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
	int updateById(User record);

	@Select({ "select * from user where password=#{password,jdbcType=VARCHAR} and ",
			"(id = #{id,jdbcType=VARCHAR} or email=#{id,jdbcType=VARCHAR} or phone=#{id,jdbcType=VARCHAR})" })
	User selectForLogin(String id, String password);
}