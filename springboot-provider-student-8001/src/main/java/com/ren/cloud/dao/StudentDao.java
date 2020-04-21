package com.ren.cloud.dao;

import com.ren.cloud.info.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RL on 2020/04/18 21:46
 * Description: no description
 */
@Mapper
@Repository
public interface StudentDao {
    public boolean addOne(Student student);

    public Student queryById(Long id);

    public List<Student> queryAll();
}
