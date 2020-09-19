package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Menu {
	@Results(id="menu",value= {
			@Result(column="pic_address",property="sPicAddress",jdbcType=JdbcType.VARCHAR),
	})
	@Select("select * from menu_pic")
	List<Menu> getMenus();
}
