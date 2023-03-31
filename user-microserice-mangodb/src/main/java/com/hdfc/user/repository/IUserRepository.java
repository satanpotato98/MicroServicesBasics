package com.hdfc.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.user.entity.User;

@Repository
public interface IUserRepository extends MongoRepository<User, Long> {

}
