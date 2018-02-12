/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.dao.impl;

import com.akhilesh.dao.EmployeeDAO;
import com.akhilesh.entity.Employee;
import com.akhilesh.util.DynamicList;
import com.akhilesh.util.MyList;

/**
 *
 * @author Akhilesh
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private DynamicList<Employee> empList = new MyList<>();

    @Override
    public boolean add(Employee emp) {
          return empList.add(emp);
    }

    @Override
    public boolean delete(int empId) {
        Employee employee = searchByEmpId(empId);
        if (employee != null) {
            
            return true;
        }
        return false;
    }

    @Override
    public DynamicList<Employee> getAll() {
        return empList;
    }

    @Override
    public Employee searchByEmpId(int empId) {
        for (Employee emp : empList) {
            if (empId == emp.getEmpId()) {
                return emp;
            }
        }
        return null;
    }

}
