package com.solar.solarproject.DAO;

import com.solar.solarproject.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, Integer> {

}
