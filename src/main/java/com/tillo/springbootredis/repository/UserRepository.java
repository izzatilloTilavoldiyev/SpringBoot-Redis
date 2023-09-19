package com.tillo.springbootredis.repository;

import com.tillo.springbootredis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    boolean saveUser(User user);

    List<User> getAllUser();

    User getUserById(Long userID);

    boolean deleteUser(Long userID);
}