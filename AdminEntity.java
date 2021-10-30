package com.booking.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="admin")
@Entity
public class AdminEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	private String admin_name;
	private String admin_password;
	private int admin_phone;
	private String admin_email;
	
	public AdminEntity() {
		super();
		}

	public AdminEntity(int admin_id, String admin_name, String admin_password, int admin_phone, String admin_email) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
		this.admin_phone = admin_phone;
		this.admin_email = admin_email;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public int getAdmin_phone() {
		return admin_phone;
	}

	public void setAdmin_phone(int admin_phone) {
		this.admin_phone = admin_phone;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	@Override
	public String toString() {
		return "AdminEntity [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_password=" + admin_password
				+ ", admin_phone=" + admin_phone + ", admin_email=" + admin_email + "]";
	}
	
	
	
}
