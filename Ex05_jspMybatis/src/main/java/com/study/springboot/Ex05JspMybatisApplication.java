package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Ex05JspMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex05JspMybatisApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Ex05JspMybatisApplication.class);
	}
}
