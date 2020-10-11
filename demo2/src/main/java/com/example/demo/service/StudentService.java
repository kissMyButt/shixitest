package com.example.demo.service;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public Student getStudentById(int id){
        return studentMapper.selectById(id);
    }
    //添加学生
    public int insertStudentById(Student student){
        return studentMapper.insert(student);
    }
    //更新学生
    public int updateStudent(Student student){
        return studentMapper.updateById(student);
    }


    //分页查询
//    public List<Student> findbypage(int number,int size){
//        return studentMapper.selectp
//    }
    /*//删除用户
    public int deleteStudent(int id) {
        return this.studentMapper.deleteStudent(id);
    }

    //查询所有用户
    public List<Student> findAllStudent(){
        return this.studentMapper.findAllStudent();
    }*/
}


