package com.billpayment.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.billpayment")

public class BillPaymentApp {

	public static void main(String[] args) {
	System.out.println("I am In Boot");
		SpringApplication.run(BillPaymentApp.class, args);
	}

}
