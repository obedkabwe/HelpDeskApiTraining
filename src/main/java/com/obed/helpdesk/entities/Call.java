package com.obed.helpdesk.entities;
import java.time.LocalDate;
import java.util.Objects;

import com.obed.helpdesk.enums.Priority;
import com.obed.helpdesk.enums.Status;

public class Call {

	
	private Integer id;
	private LocalDate  openDate =  LocalDate.now();
	private LocalDate closedDate = LocalDate.now();
	private Priority priority;
	private Status status;
	private String  title;
	private String observations;
	
	
	
	
	
	
	
	
	public Call() {
		super();
	}



	public Call(Integer id, String title, String observations) {
		super();
		this.id = id;
		this.title = title;
		this.observations = observations;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDate getOpenDate() {
		return openDate;
	}



	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}



	public LocalDate getClosedDate() {
		return closedDate;
	}



	public void setClosedDate(LocalDate closedDate) {
		this.closedDate = closedDate;
	}



	public Priority getPriority() {
		return priority;
	}



	public void setPriority(Priority priority) {
		this.priority = priority;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getObservations() {
		return observations;
	}



	public void setObservations(String observations) {
		this.observations = observations;
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
		Call other = (Call) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
