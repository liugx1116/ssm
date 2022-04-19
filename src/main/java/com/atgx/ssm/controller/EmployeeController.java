package com.atgx.ssm.controller;

import com.atgx.ssm.bean.EMP;
import com.atgx.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getEmp")
    @ResponseBody
    public List<EMP> getEmp(HttpServletRequest request) {
        List<EMP> emps = employeeService.queryAllUser();

        return emps;
    }
}
