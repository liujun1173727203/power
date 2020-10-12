package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.Classes;

@Mapper
public interface ClassesMapper {
	@Select("select * from `class`")
	@Results(id="toclasses",value= {
	@Result(column="class_id",property="iClassId", jdbcType=JdbcType.INTEGER,id=true),
	@Result(column="class_name",property="sClassName", jdbcType=JdbcType.VARCHAR),
	})
	List<Classes> getClasses();
	
	@Insert("insert into class(class_name)values(#{sClassName})")
	Boolean addClasses(Classes classes);
	
	@Delete("delete from `class` where class_id=#{iClassId} or class_name=#{sClassName}")
	Boolean delClasses(String sClassName);
	
	@Update("update `class` set class_name =#{sClassName} where class_id=#{iClassId}")
	Boolean upClasses(Classes classes);
	
}
