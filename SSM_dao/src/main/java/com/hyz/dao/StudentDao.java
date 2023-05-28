package com.hyz.dao;

import com.hyz.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: ��yz
 * @Date: 2023/5/27 21:00
 * @Version 1.0
 */
@Repository
public interface StudentDao {

        // ��ѯ����ѧ��
        @Select("select * from student")
        List<Student> findAll();

        // ���ѧ��
        @Insert("insert into student values(null,#{name},#{sex},#{address})")
        void add(Student student);

}
