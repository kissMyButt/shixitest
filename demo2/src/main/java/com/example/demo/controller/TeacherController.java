package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.ApiResult;
import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import com.example.demo.dao.StudentMapper;
import com.example.demo.service.TeacherService;
import com.example.demo.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @Resource
    private StudentMapper studentMapper;

    @RequestMapping("/getAllStudent")
    public  ApiResult allStu(){
        ApiResult apiResult = new ApiResult();
        List students = teacherService.findAllStudent();
        if(students==null){
            apiResult.setCode(400);
            apiResult.setMsg("空表");
            return apiResult;
        } else {
            apiResult.setCode(200);
            apiResult.setData(students);
            apiResult.setMsg("查询成功");
            return apiResult;
        }
    }

    @PostMapping("/addStudent")
    public  ApiResult addStu(@RequestBody Student student){
        ApiResult apiResult = new ApiResult();
        int result = teacherService.insertStudent(student);
        if(result==0){
            apiResult.setCode(400);
            apiResult.setMsg("添加学生失败");
            return apiResult;
        } else {
            apiResult.setCode(200);
            apiResult.setMsg("添加成功");
            return apiResult;
        }
    }

    @GetMapping(value = "/deleteStudent/{id}")
    public ApiResult deleteStu(@PathVariable("id") Integer id){
        ApiResult apiResult = new ApiResult();
        int result = teacherService.deleteStudent(id);
        if(result==0){
            apiResult.setCode(400);
            apiResult.setMsg("删除学生失败");
            return apiResult;
        } else {
            apiResult.setCode(200);
            apiResult.setMsg("删除成功");
            return apiResult;
        }
    }

    //分页查询学生,投机取巧，绕过service，可耻
    @GetMapping(value = "/queryUser/{current}/{size}")
    public StudentVo queryList(@PathVariable("current") Integer current,
                               @PathVariable("size") Integer size) {
        /**
         * 这些代码应该写在service层
         */
        StudentVo studentVo = new StudentVo();
        IPage<Student> page = new Page<>(current, size);
        studentMapper.selectPage(page, null);
        studentVo.setCurrent(current);
        studentVo.setSize(size);
        studentVo.setTotal(page.getTotal());
        studentVo.setStudentsList(page.getRecords());
        return studentVo;
    }

    @PostMapping(value = "/login")
    public Object get(@RequestBody Teacher teacher) {
        int id = teacher.getId();
        String password = teacher.getPassword();
        ApiResult apiResult = new ApiResult();
        Teacher result = teacherService.getTeacherById(id);
        if(result==null){
            apiResult.setCode(400);
            apiResult.setMsg("账号不存在");
            return apiResult;
        }
        else{
            if(password.equals(result.getPassword())){
                apiResult.setCode(200);
                apiResult.setMsg("验证通过");
                apiResult.setData(result);
                return apiResult;
            }
            else{
                apiResult.setCode(404);
                apiResult.setMsg("密码错误");
            }
        }
        return apiResult;
    }
}
