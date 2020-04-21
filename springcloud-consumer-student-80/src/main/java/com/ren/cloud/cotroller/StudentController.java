package com.ren.cloud.cotroller;

import com.ren.cloud.info.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by RL on 2020/04/19 13:01
 * Description: no description
 */
@RestController
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/add/")
    public Boolean addOne(Student student){
        return restTemplate.postForObject(REST_URL_PREFIX+"/add",student,Boolean.class);
    }

    @RequestMapping("/consumer/getById/{id}")
    public Student getOne(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/getById"+id,Student.class);
    }

    @RequestMapping("/consumer/list/{id}")
    public List<Student> getAll(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/list", List.class);
    }
}
