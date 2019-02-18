package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String email;
	private String password;
	private String uname;
	private String address;
	private String mobile;
	private String status="applied";
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public User(String email, String password, String uname, String address,
			String mobile) {
		super();
		this.email = email;
		this.password = password;
		this.uname = uname;
		this.address = address;
		this.mobile = mobile;
	}
	public User(String email) {
		super();
		this.email = email;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", uname="
				+ uname + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
}
