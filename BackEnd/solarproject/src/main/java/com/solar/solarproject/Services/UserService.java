package com.solar.solarproject.Services;

import com.solar.solarproject.Entities.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService extends JpaRepository<UserEntity, Integer> {
    public List<UserEntity> getUsers();
    public String test();
    public void deleteUser(Long id);
    public UserEntity update(UserEntity user);
    public UserEntity addUser(UserEntity user);
    public boolean isPresent(int id, String password);
    public UserEntity getUser(int id);
}
