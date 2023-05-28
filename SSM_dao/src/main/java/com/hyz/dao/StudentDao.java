package com.hyz.dao;

import com.hyz.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/5/27 21:00
 * @Version 1.0
 */
@Repository
public interface StudentDao {

        // 查询所有学生
        @Select("select * from student")
        List<Student> findAll();

        // 添加学生
        @Insert("insert into student values(null,#{name},#{sex},#{address})")
        void add(Student student);

}
