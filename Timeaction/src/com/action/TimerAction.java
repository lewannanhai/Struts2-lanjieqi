package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <100; i++) {
			System.out.println("Hellow World");
			
		}
		
		return "success";
	}
	
	
	
	

}
