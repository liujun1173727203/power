package com.xiaoer.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xiaoer.manage.dao")
@SpringBootApplication
public class PowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerApplication.class, args);

	}
	

}
