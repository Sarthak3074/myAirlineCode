package com.booking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartRequest;

import com.booking.Dao.UserDao;
import com.booking.Entity.UserEntity;

import Exception.UserNotFoundException;

@Service
public class UserDetailsImpl {
    @Autowired
    private UserDao userRepository;
    //retrive all the Users
    
    @Autowired
    private UserEntity userEntity;

    //retrive User
    public List<UserEntity> retriveAllUser() throws UserNotFoundException,RuntimeException{
        return userRepository.findAll();
    }


    //retrive User
    public UserEntity retriveUser(long id) throws UserNotFoundException,RuntimeException{
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User", "ID ", id));
    }

    //update the User Details
    public UserEntity retriveUser(UserEntity user,long id) throws UserNotFoundException,RuntimeException{
    	UserEntity retriveUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User", "ID ", id));
        if (retriveUser != null)
            user.setUserId(retriveUser.getUserId());

        return userRepository.save(user);
    }

    //Delete the User
    public ResponseEntity<?> removeUser(long id) throws UserNotFoundException,RuntimeException{
    	UserEntity retriveUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User", "ID ", id));
        userRepository.delete(retriveUser);
        return ResponseEntity.ok("User Deleted Successfully!!");
    }

	public String loadUserByUsername(String email) {
		String email1 =userEntity.getEmailId();
		return email1;
	}


	public String getUsername() {
	 String userName =userEntity.getuserName();
		return userName;
	}


	public String getEmailId() {
		String emailID = userEntity.getEmailId();
		return emailID;
	}
	
}
