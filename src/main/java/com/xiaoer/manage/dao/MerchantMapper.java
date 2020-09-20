package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.Merchant;

@Mapper
public interface MerchantMapper {
	
	@Results(id="merchants",value= {
			@Result(column="mer_phone",property="iMerPhone",jdbcType=JdbcType.INTEGER),
			@Result(column="mer_address",property="sMerAddress",jdbcType=JdbcType.VARCHAR),
			@Result(column="pass",property="sPass",jdbcType=JdbcType.VARCHAR)
	})
	@Select("select * from merchant")
	List<Merchant> getMerchants();
	
}

