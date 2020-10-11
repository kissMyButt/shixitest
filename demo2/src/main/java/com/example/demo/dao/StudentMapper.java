package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    /*//通过ID查询客户
    public Student findStudentById(Integer id);
    //添加用户
    public int addStudent(Student student);
    //删除用户
    public int deleteStudent(Integer id);
    //更新用户
    public void updateStudent(Student student);
    //查找全部
    public List<Student> findAllStudent();*/
}
