package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.bean.Jobs;
import com.example.demo.dao.JobsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobsService {

    @Resource
    private JobsMapper jobsMapper;

    public List<Jobs> getAllJobs(){
        return jobsMapper.selectList(new QueryWrapper() );
    }
}
