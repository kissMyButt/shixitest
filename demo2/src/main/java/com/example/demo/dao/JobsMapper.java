package com.example.demo.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.Jobs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobsMapper extends BaseMapper<Jobs> {

}
