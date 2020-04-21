package com.ren.cloud.service;

import com.ren.cloud.info.Student;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Created by RL on 2020/04/18 22:00
 * Description: no description
 */
public interface StudentService {
    public boolean addOne(Student student);

    public Student queryById(Long id);

    public List<Student> queryAll();
}
