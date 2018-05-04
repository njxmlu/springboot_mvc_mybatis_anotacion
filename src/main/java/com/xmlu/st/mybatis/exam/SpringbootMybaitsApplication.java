package com.xmlu.st.mybatis.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xmlu.st.mybatis.exam.mapper")
public class SpringbootMybaitsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybaitsApplication.class, args);
	}
}