package com.springfirstproject.maven.SpringFirstProject;

public class Customers {
	private int id;
	private String fullName;
	private String email;
	private Address address;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", fullName=" + fullName + ", email=" + email + ", address=" + address + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
