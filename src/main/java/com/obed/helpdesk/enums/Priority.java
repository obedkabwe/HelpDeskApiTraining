package com.obed.helpdesk.enums;

public enum Priority {

    BAIXA(0,"BAIXA"),
	MEDIUM(1,"MEDIUM"),
	HIGH(2,"HIGH");
	
	
	private Integer code;
	private String description;
	
	private Priority(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	
	public static Priority toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Priority x : Priority.values()) {
			if (cod == x.getCode()) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid Priority");
		
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
