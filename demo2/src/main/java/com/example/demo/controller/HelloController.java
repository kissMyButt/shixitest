package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.bean.ApiResult;
import com.example.demo.bean.User;
import com.example.demo.dao.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;


    @GetMapping
    public Object get(int id) {
        ApiResult apiResult = new ApiResult();
        User user = userService.getById(id);
        if (user == null) {
            apiResult.setCode(400);
            apiResult.setMsg("error");
            return apiResult;
        }
        apiResult.setCode(200);
        apiResult.setMsg("success");
        apiResult.setData(user);
        return apiResult;
    }

    @PostMapping("/login")
    public Object login(@RequestBody User user) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(400);
        apiResult.setMsg("error");
        apiResult.setData(user);
        return apiResult;
    }
}
