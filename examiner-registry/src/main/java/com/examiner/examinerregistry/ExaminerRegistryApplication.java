package com.examiner.examinerregistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExaminerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminerRegistryApplication.class, args);
	}

}
