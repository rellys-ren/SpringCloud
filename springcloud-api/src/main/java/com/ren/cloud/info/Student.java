package com.ren.cloud.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
/**
 * Created by RL on 2020/4/18 18:45
 * Description: SpringCloud
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Student implements Serializable {
    private Long id;
    private String name;
    private int code;
}
