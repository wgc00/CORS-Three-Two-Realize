package com.wgc.jsonp.dao;

import com.wgc.jsonp.entity.Employee;
import java.util.List;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated
     */
    Employee selectByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated
     */
    List<Employee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Employee record);
}