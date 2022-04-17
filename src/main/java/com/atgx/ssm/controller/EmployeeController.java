package com.atgx.ssm.controller;

import com.atgx.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/aa")
    public void getEmp(){
        employeeService.queryAllUser();
    }
}
