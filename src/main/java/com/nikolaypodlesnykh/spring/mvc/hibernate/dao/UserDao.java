package com.nikolaypodlesnykh.spring.mvc.hibernate.dao;

import com.nikolaypodlesnykh.spring.mvc.hibernate.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllEmployees();
}
