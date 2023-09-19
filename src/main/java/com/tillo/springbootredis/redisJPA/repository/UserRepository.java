package com.tillo.springbootredis.redisJPA.repository;

import com.tillo.springbootredis.redisJPA.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
