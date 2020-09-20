package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.Menu;

@Mapper
public interface MenuMapper {
	@Results(id="menu",value= {
			@Result(column="id",property="iId",jdbcType=JdbcType.INTEGER,id=true),
			@Result(column="pic_address",property="sPicAddress",jdbcType=JdbcType.VARCHAR),
	})
	@Select("select * from menu_pic")
	List<Menu> getMenus();
	
	@Delete("delete from menu_pic where id={#iId}")
	Boolean delMenu(int id);
	
	@Select("select * from menu_pic where id={#iId}")
	@ResultMap(value="menu")
	Menu getMenu(int iId);
}
