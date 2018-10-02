package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/delete")
    public String delete(int id) {
        int result = userService.delete(id);
        if(result >= 1) {
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @PostMapping("/update")
    public String update(User user) {
        int result = userService.update(user);
        if(result >= 1) {
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @PostMapping("/insert")
    public User insert(User user) {
        return userService.insertUser(user);
    }

    @GetMapping("ListUser")
    @ResponseBody
    public List<User> ListUser() {
        return userService.ListUser();
    }

    @GetMapping("ListUserByName")
    @ResponseBody
    public List<User> ListUserByname(String name) {
        return userService.findByName(name);
    }

}
