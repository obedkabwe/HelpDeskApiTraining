package com.obed.helpdesk.entities;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.obed.helpdesk.enums.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

	@Id
	protected Integer id;
	protected String name;
	protected String socialSecurity;
	protected String email;
	protected String password;
	protected Set<Profile> profiles = new  HashSet<>();
	protected LocalDate creationDate = LocalDate.now() ;
	
	
	public Person() {
		super();
	}


	public Person(Integer id, String name, String socialSecurity, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.socialSecurity = socialSecurity;
		this.email = email;
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSocialSecurity() {
		return socialSecurity;
	}


	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Set<Profile> getProfiles() {
		return profiles;
	}


	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}


	public LocalDate getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}


	
	
	
	
	
	
}
