package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import com.example.demo.dao.StudentMapper;
import com.example.demo.dao.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    @Resource
    private StudentMapper studentMapper;

    public List<Student> findAllStudent() {
        return this.studentMapper.selectList(new QueryWrapper());
    }

    public int insertStudent(Student student){
        return this.studentMapper.insert(student);
    }

    public int deleteStudent(Integer id){
        return this.studentMapper.deleteById(id);
    }

    public Teacher getTeacherById(int id){
        return  this.teacherMapper.selectById(id);
    }

}
