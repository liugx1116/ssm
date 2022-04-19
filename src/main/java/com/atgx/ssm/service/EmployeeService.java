package com.atgx.ssm.service;

import com.atgx.ssm.bean.EMP;
import com.atgx.ssm.dao.EMPMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EMPMapper empMapper;
    public List<EMP> queryAllUser() {
        List<EMP> emps = empMapper.selectByExample(null);
        System.out.println(emps);
        return emps;
    }
}
