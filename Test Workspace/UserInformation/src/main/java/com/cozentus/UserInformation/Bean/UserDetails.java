package com.cozentus.UserInformation.Bean;

import java.util.List;
import java.util.Set;

public class UserDetails {
	
	private List<String> user_id;
	private List<String> name;
	private List<String> user_address;
	private Set<String> contactNo;
	
	
	public UserDetails() {}

	public UserDetails(List<String> user_id, List<String> name, List<String> user_address, Set<String> contactNo) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.user_address = user_address;
		this.contactNo = contactNo;
	}
	
	public List<String> getUser_id() {
		return user_id;
	}
	public void setUser_id(List<String> user_id) {
		this.user_id = user_id;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<String> getUser_address() {
		return user_address;
	}
	public void setUser_address(List<String> user_address) {
		this.user_address = user_address;
	}
	public Set<String> getContactNo() {
		return contactNo;
	}
	public void setContactNo(Set<String> contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "UserDetails = [user_id=" + user_id + ", name=" + name + ", user_address=" + user_address + ", contactNo="
				+ contactNo + "]";
	} 
}