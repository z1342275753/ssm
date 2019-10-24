package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/login",method= RequestMethod.POST)
    public String list(Model model){
        List<Student> list=studentService.findAll();
        model.addAttribute("list",list);
        return "login";
    }

}
