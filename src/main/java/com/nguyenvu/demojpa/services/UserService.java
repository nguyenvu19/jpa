package com.nguyenvu.demojpa.services;

import com.nguyenvu.demojpa.entity.UserEntity;
import com.nguyenvu.demojpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceImp {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        List<UserEntity> list = userRepository.findAll();
        return list;
    }

    @Override
    public List<UserEntity> getUserByEmailAndPassword(String email, String password) {
        return userRepository.getUserEmailPassword(email, password);
    }

    @Override
    public void save(UserEntity user) {
        userRepository.save(user);
    }
}
