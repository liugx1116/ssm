package com.atgx.ssm.service;

import com.atgx.ssm.bean.EMP;
import com.atgx.ssm.dao.EMPMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    EMPMapper empMapper;
    public List<EMP> queryAllUser() {
        List<EMP> emps = empMapper.selectByExample(null);
        System.out.println(emps);
        return emps;
    }
}
