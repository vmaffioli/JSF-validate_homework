package com.vmaffioli.validatedemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentThree {
	
	private String firstName;
	private String lastName;
	private String phone;
	
	public StudentThree() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}
