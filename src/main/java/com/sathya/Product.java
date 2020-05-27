package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value("123")
	private int pid;
	@Value("RealMe X2")
	private String pname;
	@Autowired
	 Model model;
	
	public void productData() {
		System.out.println("Product Data i:"+pid+"==="+pname);
		model.modelData();
	}

}
