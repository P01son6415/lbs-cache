package com.zdxk.lbscache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.zdxk.lbscache.dao")
public class LbsCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbsCacheApplication.class, args);
	}

}

