package com.obed.helpdesk.enums;


public enum Status {

	OPEN(0,"OPEN"),
	PROCESSING(1,"PROCESSING"),
	CLOSED(2,"CLOSED");
	
	private Integer code;
	private String desciption;
	
	
	private Status(Integer code, String desciption) {
		this.code = code;
		this.desciption = desciption;
	}


	public Integer getCode() {
		return code;
	}


	public String getDesciption() {
		return desciption;
	}
	
	
	
	public static Status toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Status x : Status.values()) {
			if (cod == x.getCode()) {
				return x;
			}
		
		}
		
		throw new IllegalArgumentException("invalid Status");
	}
	
	
	
	
	
	
	
	
	
	
	
}
