package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.Users;

@Mapper
public interface userMapper {
	@Select("select * from users")
	@Results(id="userMap",value= {
		@Result(property="id",column="id",jdbcType=JdbcType.INTEGER,id=true),
		@Result(property="account",column="account",jdbcType=JdbcType.VARCHAR),
		@Result(property="pass",column="pass",jdbcType=JdbcType.VARCHAR),
		@Result(property="area",column="area",jdbcType=JdbcType.VARCHAR),
		@Result(property="percent",column="percent",jdbcType=JdbcType.FLOAT),
		@Result(property="phone",column="phone",jdbcType=JdbcType.VARCHAR),
		@Result(property="datetime",column="create_time",jdbcType=JdbcType.DATE),
		@Result(property="state",column="state",jdbcType=JdbcType.INTEGER),
		@Result(property="authority",column="authority",jdbcType=JdbcType.INTEGER),
		@Result(property="name",column="name",jdbcType=JdbcType.VARCHAR),
		@Result(property="nickname",column="nickname",jdbcType=JdbcType.VARCHAR),
		@Result(property="wechat_img",column="wechat_img",jdbcType=JdbcType.VARCHAR),
	})
	List<Users> selectUsers();
	
	@Select("select * from users where account=#{account}")
	@ResultMap(value="userMap")
	Users findUser(String account);
	
	@Insert("insert into users(account,area,percent,phone,state,authority,name,nickname,wechat_img)values(#{account},#{area},#{percent},#{phone},#{state},#{authority},#{name},#{nickname},#{wechat_img}")
	boolean addUser(Users user);
	
	@Update("update users set account=#{account},area=#{area},percent=#{percent},phone=#{phone},state=#{state},authority=#{authority},name=#{name},nickname=#{nickname},wechat_img=#{wechat_img} where id=#{id}")
	boolean updateUser(Users user);
	
	@Delete("delete from users where account=#{account}")
	boolean delUser(String account);

}
