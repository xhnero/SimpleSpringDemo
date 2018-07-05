package com.spring.pojo;

import java.util.Date;

public class UserDto {
	private Integer id;
	private String username;
	private String name;
	private String password;
	private String phoneNo;
	private Date dob;
	private AddressDto addr;
	public AddressDto getAddress() {
		return addr;
	}
	public void setAddr(AddressDto address) {
		this.addr = address;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String toString() {
		return "This is a singleton object";
	}
	
	
}
