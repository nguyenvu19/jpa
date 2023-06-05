package com.nguyenvu.demojpa.services;

import com.nguyenvu.demojpa.entity.UserEntity;

import java.util.List;

public interface UserServiceImp {
    List<UserEntity> getAllUsers();

    List<UserEntity> getUserByEmailAndPassword(String email, String password);
    void save(UserEntity user);
}
