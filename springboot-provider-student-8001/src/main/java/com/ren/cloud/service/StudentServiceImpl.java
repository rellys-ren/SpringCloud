package com.ren.cloud.service;

import com.ren.cloud.dao.StudentDao;
import com.ren.cloud.info.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by RL on 2020/04/18 22:01
 * Description: no description
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean addOne(Student student) {
        return studentDao.addOne(student);
    }

    @Override
    public Student queryById(Long id) {
        return studentDao.queryById(id);
    }

    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }
}
