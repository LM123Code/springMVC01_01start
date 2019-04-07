package com.springMVC01_01start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LM_Code
 * @create 2019-04-07-9:34
 */
@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping(path = "/hello", method = {RequestMethod.POST, RequestMethod.GET})
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
