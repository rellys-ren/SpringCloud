package com.ren.cloud.controller;

import com.ren.cloud.info.Student;
import com.ren.cloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by RL on 2020/04/18 22:04
 * Description: 提供restfule服务
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/add")
    public boolean addOne(@RequestBody Student student) {
        return studentService.addOne(student);
    }

    @GetMapping("/getById/{id}")
    public Student queryById(@PathVariable("id") Long id) {
        return studentService.queryById(id);
    }

    @GetMapping("/list")
    public List<Student> queryAll() {
        return studentService.queryAll();
    }
}
