package com.solar.solarproject.Controller;

import com.solar.solarproject.DAO.*;
import com.solar.solarproject.Entities.UserEntity;
import com.solar.solarproject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired(required = true)
    private UserService userService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/list")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>(userService.test(), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable int id){
        UserEntity user = userService.getUser(id);
        return user!= null ? new ResponseEntity<>(user, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/signin")
    public ResponseEntity<UserEntity> signin(@RequestBody UserEntity user){
        UserEntity added_user = userService.addUser(user);
        return added_user!= null ? new ResponseEntity<>(added_user, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/allusers")
    public List<UserEntity> getUsers(){
        return userService.getUsers();
    }


    @GetMapping("login/{id}/{password}")
    public ResponseEntity<Boolean> login(@PathVariable int id, @PathVariable String password){
        return new ResponseEntity<>(userService.isPresent(id, password), HttpStatus.OK);
    }

}
