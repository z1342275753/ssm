package com.service.Impl;

import com.entity.Student;
import com.mapper.StudentMapper;
import com.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }
}
