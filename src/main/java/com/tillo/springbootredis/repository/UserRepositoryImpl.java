package com.tillo.springbootredis.repository;


import com.tillo.springbootredis.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository{

    private final RedisTemplate redisTemplate;
    private static final String KEY = "USER";

    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> getAllUser() {
        return redisTemplate.opsForHash().values(KEY);
    }

    @Override
    public User getUserById(Long userID) {
        return (User) redisTemplate.opsForHash().get(KEY, userID);
    }

    @Override
    public boolean deleteUser(Long userID) {
        try {
            redisTemplate.opsForHash().delete(KEY, userID.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}