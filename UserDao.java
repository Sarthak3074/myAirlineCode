package com.booking.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.booking.Entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Long>{

}
