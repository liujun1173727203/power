package com.xiaoer.manage.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xiaoer.manage.entity.Classes;

@Service
public interface ClassesServer {
	List<Classes> getClasses();
	Boolean addClasses(Classes classes);
	Boolean delClasses(String name);
	Boolean upClasses(Classes classes); 	
}
