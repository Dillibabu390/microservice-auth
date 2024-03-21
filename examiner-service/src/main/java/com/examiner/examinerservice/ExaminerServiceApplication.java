package com.examiner.examinerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExaminerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminerServiceApplication.class, args);
	}

}
