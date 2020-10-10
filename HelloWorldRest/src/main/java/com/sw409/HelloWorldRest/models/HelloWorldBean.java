package com.sw409.HelloWorldRest.models;

public class HelloWorldBean {
	
	private String message;
	
	public HelloWorldBean(String str) {
		
		this.message = str;
		
	}
	
	public String getmes() {
		return this.message;
	}
	
	public void setmes(String message) {
		this.message = message;
	}
	
	public String toString() {
		
		return this.message;
		
	}

}
