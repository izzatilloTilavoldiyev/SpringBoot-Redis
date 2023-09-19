package com.tillo.springbootredis.redisJPA.service.user;


import com.tillo.springbootredis.redisJPA.entity.User;
import com.tillo.springbootredis.redisJPA.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public boolean saveUser(User user) {
        if (userRepository.existsById(user.getId()))
            return false;
        userRepository.save(user);
        return true;
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    @Override
    public User getUserById(Long userID) {
        return userRepository.findById(userID).get();
    }

    @Override
    public boolean deleteUser(Long userID) {
        if (userRepository.existsById(userID)) {
            userRepository.deleteById(userID);
            return true;
        } else return false;
    }

}