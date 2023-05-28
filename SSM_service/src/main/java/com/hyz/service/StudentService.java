package com.hyz.service;

import com.hyz.dao.StudentDao;
import com.hyz.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: º«yz
 * @Date: 2023/5/27 21:21
 * @Version 1.0
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> findAllStudent(){
        return studentDao.findAll();
    }

    public void addStudent(Student student){
        studentDao.add(student);
    }
}
