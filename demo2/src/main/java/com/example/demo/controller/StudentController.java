package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.bean.ApiResult;
import com.example.demo.bean.Student;
import com.example.demo.dao.StudentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/stu")
@CrossOrigin
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private StudentMapper studentMapper;

    @GetMapping("/login")
    public Object get(int id,String pwd) {
        ApiResult apiResult = new ApiResult();
        Student student1 = studentService.getStudentById(id);
        if(student1==null){
            apiResult.setCode(400);
            apiResult.setMsg("账号不存在");
            return apiResult;
        }
        else{
            if(pwd.equals(student1.getPassword())){
                apiResult.setCode(200);
                apiResult.setMsg("验证通过");
                return apiResult;
            }
            else{
                apiResult.setCode(404);
                apiResult.setMsg("密码错误");
            }
        }
        return apiResult;
    }

    @GetMapping("/management")
    public Object get(int id) {
        ApiResult apiResult = new ApiResult();
        Student student1 = studentService.getStudentById(id);
        if(student1==null){
            apiResult.setCode(400);
            apiResult.setMsg("账号不存在");
            return apiResult;
        }
        else{
            apiResult.setCode(200);
            apiResult.setMsg("成功");
            apiResult.setData(student1);
        }
        return apiResult;
    }

    @GetMapping("/register")
    public Object get(int id,String pwd,String contact) {
        ApiResult apiResult = new ApiResult();
        Student student = new Student();
        student.setId(id);
        student.setPassword(pwd);
        student.setContact(contact);
        int i = studentService.insertStudentById(student);
        if(i!=1){
            apiResult.setCode(400);
            apiResult.setMsg("无法新增该学生");
            return apiResult;
        }
        else{
            apiResult.setCode(200);
            apiResult.setMsg("新增用户成功");
        }
        return apiResult;
    }
//    @RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("pwd")String pwd,
//    @RequestParam("gender")String gender,@RequestParam("birth")String birth,
//    @RequestParam("edu")String edu,@RequestParam("nation")String nation,
//    @RequestParam("contact")String contact,@RequestParam("nativeplace")String nativeplace,
//    @RequestParam("politicestatus")String politicestatus,
//    @RequestParam("email")String email,@RequestParam("major")String major,
//    @RequestParam("ability")String ability
    @PostMapping("/update")
    public Object post(@RequestBody Student student) {
        ApiResult apiResult = new ApiResult();
//        student.setId(id);
//        student.setName(name);
//        student.setPassword(pwd);
//        student.setGender(gender);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
//        Date d = null;
//        try {
//            d = simpleDateFormat.parse(birth);
//            student.setBirth(d);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        student.setEdu(edu);
//        student.setNation(nation);
//        student.setContact(contact);
//        student.setNativeplace(nativeplace);
//        student.setPoliticestatus(politicestatus);
//        student.setEmail(email);
//        student.setMajor(major);
//        student.setAbility(ability);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
//        String date=student.getBirth().toString();
//        try {
//             Date d = simpleDateFormat.parse(date);
//            student.setBirth(d);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        int i = studentService.updateStudent(student);
        if(i!=1){
            apiResult.setCode(400);
            apiResult.setMsg("修改失败");
            return apiResult;
        }
        else{
            apiResult.setCode(200);
            apiResult.setData(student);
            apiResult.setMsg("修改成功");
        }
        return apiResult;
    }
//    @PostMapping("/login")
//    public Object login(@RequestBody Student student) {
//        ApiResult apiResult = new ApiResult();
//        Student student1 = studentService.getStudentById(student.getId());
//        if(student1==null){
//            apiResult.setCode(400);
//            apiResult.setMsg("账号不存在");
//            return apiResult;
//        }
//        else{
//            if(student.getPassword().equals(student1.getPassword())){
//                apiResult.setCode(200);
//                apiResult.setMsg("验证通过");
//                return apiResult;
//            }
//            else{
//                apiResult.setCode(404);
//                apiResult.setMsg("密码错误");
//            }
//        }
//        return apiResult;
//    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/json");
        resp.setCharacterEncoding("utf-8");
        String ids= (String)req.getParameter("id"); //获取传递的参数
        int id=Integer.parseInt(ids);
        String pwd= (String) req.getParameter("pwd");
        ApiResult apiResult = new ApiResult();
        Student student1 = studentService.getStudentById(id);
        if(student1==null){
            apiResult.setCode(400);
            apiResult.setMsg("账号不存在");
            return "false";
        }
        else{
            if(pwd.equals(student1.getPassword())){
                apiResult.setCode(200);
                apiResult.setMsg("验证通过");
                return "true";
            }
            else{
                apiResult.setCode(404);
                apiResult.setMsg("密码错误");
            }
        }
        return "false";
    }

    @GetMapping(value = "/selectOneStu/{id}")
    public ApiResult selectOneStu(@PathVariable("id") Integer id){
        ApiResult apiResult = new ApiResult();
        Student result = studentService.getStudentById(id);
        if(result==null){
            apiResult.setCode(400);
            apiResult.setMsg("查询学生失败");
            return apiResult;
        } else {
            apiResult.setCode(200);
            apiResult.setMsg("查询成功");
            apiResult.setData(result);
            return apiResult;
        }
    }
}
