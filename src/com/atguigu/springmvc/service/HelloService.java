package com.atguigu.springmvc.service;/*
 *  Created by fengyapeng on 2018/11/12
 */

import com.atguigu.mybatis.mapper.EmployeeMapper;
import com.atguigu.mybatis.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public HelloService() {
        System.out.println("HelloService 被创建了！");
    }

    public Employee hello(Integer id){
        Employee employee = employeeMapper.getEmployeeById(id);

        return employee;
    }
}
