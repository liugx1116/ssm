package com.atgx.ssm.dao;

import com.atgx.ssm.bean.EMP;
import com.atgx.ssm.bean.EMPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface EMPMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    long countByExample(EMPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int deleteByExample(EMPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int insert(EMP row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int insertSelective(EMP row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    List<EMP> selectByExample(EMPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    EMP selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int updateByExampleSelective(@Param("row") EMP row, @Param("example") EMPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int updateByExample(@Param("row") EMP row, @Param("example") EMPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int updateByPrimaryKeySelective(EMP row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Apr 18 00:28:38 CST 2022
     */
    int updateByPrimaryKey(EMP row);
}