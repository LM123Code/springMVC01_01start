package com.springMVC01_01start.controller;

import com.springMVC01_01start.domain.Account;
import com.springMVC01_01start.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author LM_Code
 * @create 2019-04-07-16:02
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * java自带类型的参数绑定
     * @param username
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println(username);
        return "success";
    }

    /**
     * 封装类型的参数绑定
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String testSaveAccount(Account account){
        System.out.println(account);
        return "success";
    }
    /**
     *自定义类型转换
     */
    @RequestMapping("/saveUser")
    public String testSaveUser(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的servlet中api的获取
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        System.out.println(response);
        HttpSession session = request.getSession();
        System.out.println(session);
        System.out.println(session.getServletContext());
        return "success";
    }
}
