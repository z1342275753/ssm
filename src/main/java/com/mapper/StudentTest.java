package com.mapper;

import com.entity.Student;
import com.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml","classpath:spring-service.xml"})
public class StudentTest {
//    @Autowired
//    private StudentMapper studentMapper;
    @Autowired
    private StudentService studentService;
    @Test
    public void findAll(){
//        List<Student> list=studentMapper.selectAll();
//        for (Student s:list
//             ) {
//            System.out.println(s);
//        }
//        Student s=studentMapper.selectByPrimaryKey(6);
//        System.out.println(s);
        List<Student> list=studentService.findAll();
        for (Student s:list
        ) {
            System.out.println(s);
        }
    }
    @Test
    public void add(){

    }
}
