package com.demo.controller;

import com.demo.serviceImpl.AppointmentServiceImpl;

public class AppointmentController {
	
	public static void main(String[] args) {
		
		AppointmentServiceImpl obj=new AppointmentServiceImpl();
		
		String result=obj.generateReport();
		
		System.out.println(result);
	}
	

}
