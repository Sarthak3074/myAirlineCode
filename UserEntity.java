package com.booking.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	private String userId;
	private String userName;
	private String userPassword;
	private int UserPhone;
	private String emailId;

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", UserPhone=" + UserPhone + ", emailId=" + emailId + ", idNumber=" + idNumber + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserPhone() {
		return UserPhone;
	}

	public void setUserPhone(int userPhone) {
		UserPhone = userPhone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public UserEntity(String userId, String userName, String userPassword, int userPhone, String emailId,
			String idNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		UserPhone = userPhone;
		this.emailId = emailId;
		this.idNumber = idNumber;
	}

	public UserEntity() {
		super();
	}

	private String idNumber;
}
