package com.hyz.controller;

import com.hyz.domain.Student;
import com.hyz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/5/27 21:41
 * @Version 1.0
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @RequestMapping("/all")
    public String all(Model model){
        List<Student> allStudent = studentService.findAllStudent();
        model.addAttribute("students",allStudent);
        return "allStudent";
    }

    @RequestMapping("/add")
    public String add(Student student){
        studentService.addStudent(student);
        // 重定向到查询所有学生
        return "redirect:/student/all";
    }
}
