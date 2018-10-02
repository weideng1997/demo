package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> findByName(String name) {
         return userMapper.findUserByName(name);
    }

    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public List<User> ListUser() {
        return userMapper.ListUser();
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public int delete(int id) {
        return userMapper.delete(id);
    }
}
