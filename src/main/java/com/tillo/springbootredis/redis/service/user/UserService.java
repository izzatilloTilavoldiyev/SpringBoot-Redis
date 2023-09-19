package com.tillo.springbootredis.redis.service.user;

import com.tillo.springbootredis.redis.entity.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> getAllUser();

    User getUserById(Long userID);

    boolean deleteUser(Long userID);
}
