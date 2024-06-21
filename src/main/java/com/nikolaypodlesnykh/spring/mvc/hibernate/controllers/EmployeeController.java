package com.nikolaypodlesnykh.spring.mvc.hibernate.controllers;

import com.nikolaypodlesnykh.spring.mvc.hibernate.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    private final UserDao userDao;

    @Autowired
    public EmployeeController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping()
    public String showAllEmployees(Model model) {
        model.addAttribute("employees", userDao.getAllEmployees());
        return "employee/showAllEmployees";
    }

}
