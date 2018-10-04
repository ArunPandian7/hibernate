package com.arunhib.Task5;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String Name;
	private String Gender;
	private String FatherName;
	private String JoinedOn;
	private String BornDay;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		this.EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getJoinedOn() {
		return JoinedOn;
	}
	public void setJoinedOn(String joinedOn) {
		JoinedOn = joinedOn;
	}
	public String getBornDay() {
		return BornDay;
	}
	public void setBornDay(String bornDay) {
		BornDay = bornDay;
	}
	
		
	
	
	

	
		

	}
