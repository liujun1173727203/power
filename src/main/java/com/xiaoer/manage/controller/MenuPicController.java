package com.xiaoer.manage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiaoer.manage.serverImpl.UploadService;

@Controller
public class MenuPicController {
	@Autowired
	private UploadService uploadService;
	
	@RequestMapping(value="/fileupload",method=RequestMethod.POST)
	public String upload(HttpServletRequest request)throws IOException,ServletException	{
		String filepath=uploadService.uploadImg(request);
		return filepath;
	}
	
}
