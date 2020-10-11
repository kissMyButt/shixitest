package com.example.demo.controller;

import com.example.demo.service.JobsService;
import com.example.demo.bean.ApiResult;
import com.example.demo.dao.JobsMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin
public class JobsController {
    @Resource
    private  JobsService jobsService;

    @Resource
    private  JobsMapper jobsMapper;

    @RequestMapping("/alljobs")
    public  Object alljobs(){
        ApiResult apiResult = new ApiResult();
        List jobs = jobsService.getAllJobs();
        if(jobs==null){
            apiResult.setCode(400);
            apiResult.setMsg("空表");
            return apiResult;
        } else {
            apiResult.setCode(200);
            apiResult.setData(jobs);
            apiResult.setMsg("查询成功");
            return apiResult;
        }
    }

}
