package com.tillo.springbootredis.redisJPA.service.user;

import com.tillo.springbootredis.redisJPA.entity.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> getAllUser();

    User getUserById(Long userID);

    boolean deleteUser(Long userID);
}
