package com.hyz.dao;

import com.hyz.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: º«yz
 * @Date: 2023/5/27 21:14
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;
    @Test
    public void testFindAll(){
        List<Student> all = studentDao.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void testAdd(){
        Student student = new Student(0, "hyz", "Å®", "ÉÏº£");
        studentDao.add(student);
    }
}
