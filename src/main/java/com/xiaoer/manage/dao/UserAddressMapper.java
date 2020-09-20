package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.UserAddress;

@Mapper
public interface UserAddressMapper {
	@Results(id="userAddresses",value= {
			@Result(column="address_id",property="iAddressId",jdbcType=JdbcType.INTEGER),
			@Result(column="address_detail",property="sAddressDetail",jdbcType=JdbcType.VARCHAR),
			@Result(column="address_uid",property="iAddressuId",jdbcType=JdbcType.INTEGER),
	})
	@Select("select * from user_address where address_uid={#iAddressuId}")
	List<UserAddress> getAddresses(int iAddressuId);
}
