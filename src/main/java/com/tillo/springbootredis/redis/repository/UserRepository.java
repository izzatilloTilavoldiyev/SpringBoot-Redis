package com.tillo.springbootredis.redis.repository;

import com.tillo.springbootredis.redis.entity.User;

import java.util.List;

public interface UserRepository {
    boolean saveUser(User user);

    List<User> getAllUser();

    User getUserById(Long userID);

    boolean deleteUser(Long userID);
}