package com.groupeisi.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("ok");
		System.out.println("test2 du l'automatisation");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}
}