package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.Student;
import com.example.demo.dao.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Resource
	private StudentMapper studentMapper;
	@Test
	public void queryStudentForPage(){
		IPage<Student> studentIPage = new Page<>(2, 2);//参数一是当前页，参数二是每页个数
		studentIPage = studentMapper.selectPage(studentIPage, null);
		List<Student> list = studentIPage.getRecords();
		for(Student student : list){
			System.out.println(student);
		}
	}
}
