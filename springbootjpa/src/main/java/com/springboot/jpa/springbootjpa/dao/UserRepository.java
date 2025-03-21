package com.springboot.jpa.springbootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.springbootjpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>  {

}
