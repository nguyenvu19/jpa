package com.nguyenvu.demojpa.repository;

import com.nguyenvu.demojpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findByEmailAndPassword(String email, String password);

    @Query("select u from users u where u.email = ?1 and u.password = ?2")
    List<UserEntity> getUserEmailPassword(String email, String password);
}
