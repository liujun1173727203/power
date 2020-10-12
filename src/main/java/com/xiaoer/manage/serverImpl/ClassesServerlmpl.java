package com.xiaoer.manage.serverImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoer.manage.dao.ClassesMapper;
import com.xiaoer.manage.entity.Classes;
import com.xiaoer.manage.server.ClassesServer;

@Service
public class ClassesServerlmpl implements ClassesServer{

	@Autowired
	private ClassesMapper classesMapper;
	@Override
	public List<Classes> getClasses() {
		return classesMapper.getClasses();
	}

	@Override
	public Boolean addClasses(Classes classes) {
		// TODO Auto-generated method stub
		return classesMapper.addClasses(classes);
	}

	@Override
	public Boolean delClasses(String name) {
		// TODO Auto-generated method stub
		return classesMapper.delClasses(name);
	}

	@Override
	public Boolean upClasses(Classes classes) {
		// TODO Auto-generated method stub
		return classesMapper.upClasses(classes);
	}

}
