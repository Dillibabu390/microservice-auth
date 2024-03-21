package com.examiner.examinergateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExaminerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminerGatewayApplication.class, args);
	}

}
