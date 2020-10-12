package com.xiaoer.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoer.manage.entity.Classes;
import com.xiaoer.manage.server.ClassesServer;


//测试正常
//类别表的增删查改完成
@RestController
@RequestMapping("/classes")
public class ClassesController {
	
	@Autowired
	private ClassesServer classesServer;
	
	@RequestMapping(value="/getclasses",method = RequestMethod.GET)
	public List<Classes> getClasses(){
		return classesServer.getClasses();
	}
	@RequestMapping(value="/addclasses",method = RequestMethod.POST)
	public Boolean addClasses(Classes classs){
		return classesServer.addClasses(classs);
	}
	@RequestMapping(value="/upclasses",method = RequestMethod.POST)
	public Boolean upClasses(Classes classs){
		return classesServer.upClasses(classs);
	}
	@RequestMapping(value="/delclasses",method = RequestMethod.POST)
	public Boolean addClasses(String iclassid){
		return classesServer.delClasses(iclassid);
	}
}
