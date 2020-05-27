package com.sathya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Model {
	@Value("121")
	private int mid;
	@Value("x2")
	private String mname;
	
	public void modelData() {
		System.out.println("ModelData is:"+mid+"==="+mname);
	}

}
