package com.groupeisi.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome ");
		System.out.println("Welcome 2 ");
		SpringApplication.run(DemoJenkinsApplication.class, args);
		System.out.println(add(1,2));
	}
	public static int add(int a, int b){
		return a+b;
	}
}