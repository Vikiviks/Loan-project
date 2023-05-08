package com.example.loan.dto;


public class UserDTO {
	
	private int id;
	private String email;
	private String password;
	private String username;
	private String mobileNumber;
	private String userRoll;
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", mobileNumber=" + mobileNumber + ", userRoll=" + userRoll + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserRoll() {
		return userRoll;
	}
	public void setUserRoll(String userRoll) {
		this.userRoll = userRoll;
	}
	public UserDTO() {}
	public UserDTO(int id, String email, String password, String username, String mobileNumber, String userRoll) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.userRoll = userRoll;
	}
	
}
