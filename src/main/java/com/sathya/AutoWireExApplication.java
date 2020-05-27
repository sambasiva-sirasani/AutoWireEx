package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWireExApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AutoWireExApplication.class, args);
		Product p1=ctx.getBean("product",Product.class);
		p1.productData();
	}

}
