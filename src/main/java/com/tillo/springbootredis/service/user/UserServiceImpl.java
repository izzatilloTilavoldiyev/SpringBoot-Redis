package com.tillo.springbootredis.service.user;


import com.tillo.springbootredis.entity.User;
import com.tillo.springbootredis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public boolean saveUser(User user) {
        return userRepository.saveUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    @Override
    public User getUserById(Long userID) {
        return userRepository.getUserById(userID);
    }

    @Override
    public boolean deleteUser(Long userID) {
        return userRepository.deleteUser(userID);
    }

    // Class methods go here
}