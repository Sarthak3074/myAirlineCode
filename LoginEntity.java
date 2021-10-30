package com.booking.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.Entity.UserEntity;

public interface LoginEntity extends JpaRepository<UserEntity,Long> {

	Object getLoginID();

	Object getLoginPassword();

}
