package com.atguigu.mybatis.mapper;/*
 *  Created by fengyapeng on 2018/11/12
 */

import com.atguigu.mybatis.pojo.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {
    Employee getEmployeeById(Integer id);
}
