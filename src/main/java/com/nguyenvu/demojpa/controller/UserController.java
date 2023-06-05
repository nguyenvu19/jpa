package com.nguyenvu.demojpa.controller;

import com.nguyenvu.demojpa.entity.UserEntity;
import com.nguyenvu.demojpa.services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImp userServiceImp;

    @GetMapping("")
    public ResponseEntity<?> getAllUsers() {
        List<UserEntity> list = userServiceImp.getAllUsers();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> getUserByEmailAndPassword(@RequestParam String email, @RequestParam String password) {
        List<UserEntity> list = userServiceImp.getUserByEmailAndPassword(email, password);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserEntity user) {
        userServiceImp.save(user);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
