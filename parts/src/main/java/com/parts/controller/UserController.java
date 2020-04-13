package com.parts.controller;

import com.parts.model.User;
import com.parts.result.Result;
import com.parts.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Dmarco
 */
@Controller
@RequestMapping("/user")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public Result<User> getUserById(@RequestParam("id") Long id){
        User user=userService.getUserById(id);
        return Result.success(user);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result<List<User>> listUser(){
        List<User> userList=userService.listUser();
        return Result.success(userList);
    }

}
