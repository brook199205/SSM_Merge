package com.atguigu.springmvc.handler;/*
 *  Created by fengyapeng on 2018/11/12
 */

import com.atguigu.mybatis.pojo.Employee;
import com.atguigu.springmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHandler {

    public HelloHandler() {
        System.out.println("helloHandler被创建了");
    }

    @Autowired
    private HelloService service;

    @RequestMapping(value = "/hello")
    public String handle(Integer id,Model model){

        Employee employee = service.hello(id);

        model.addAttribute("e", employee);

        System.out.println("Handler处理了hello请求");

        return "success";
    }
}
