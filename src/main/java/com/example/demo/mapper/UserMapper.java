package com.example.demo.mapper;


import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findUserByName(String name);

    public List<User> ListUser();

    public int insertUser(User user);

    public int delete(int id);

    public int update(User user);
}
