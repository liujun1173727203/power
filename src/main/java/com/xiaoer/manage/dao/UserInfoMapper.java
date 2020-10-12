package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.UserInfomation;

@Mapper
public interface UserInfoMapper {
	@Results(id="userinfo",value= {
			@Result(column="user_id",property="iUserId",jdbcType=JdbcType.INTEGER),
			@Result(column="user_name",property="sUserName",jdbcType=JdbcType.VARCHAR),
			@Result(column="user_phone",property="iUserPhone",jdbcType=JdbcType.INTEGER),
			@Result(column="user_picture_address",property="sUserPicAddress",jdbcType=JdbcType.VARCHAR),
	})
	@Select("select * from user_information")
	List<UserInfomation> getUsersInfo();
	
	@Select("select * from user_information where user_id=#{iUserId}")
	@ResultMap(value="userinfo")
	UserInfomation findUserInfo(int iUserId);
	
	@Insert("insert into user_information(user_name,user_phone,user_picture_address)values(#{sUserName},#{iUserPhone},#{user_picture_address})")
	Boolean addUser(UserInfomation userInfomation);
}
