package com.obed.helpdesk.enums;

public enum Profile {

	ADMIN(1,"ADMIN"),
	CLIENT(2,"rpel"),
	TECHNICIAN(3,"rttr");
	
	
	
	private Integer code;
	private String description;
	
	private Profile() {
	}


	private Profile(Integer code, String description) {
		this.code = code;
		this.description = description;
	}


	public Integer getCode() {
		return code;
	}


	public String getDescription() {
		return description;
	}
	
	
	public static Profile toEnum(Integer  cod) {
		if (cod == null) {
			return null;
		}
		for (Profile x : Profile.values()) {
			if (cod == x.getCode() ) {
				return x;
			}
			
		}
		throw new IllegalArgumentException("Ivalide Profile");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
