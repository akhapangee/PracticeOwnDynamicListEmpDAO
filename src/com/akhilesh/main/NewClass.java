/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.main;

import com.akhilesh.dao.EmployeeDAO;
import com.akhilesh.dao.impl.EmployeeDAOImpl;
import com.akhilesh.entity.Employee;

/**
 *
 * @author Akhilesh
 */
public class NewClass {

    public static void main(String[] args) {
        EmployeeDAO empDAO = new EmployeeDAOImpl();
        Employee emp1 = new Employee(5, "akhilesh5", "Khapangee", "email");
        Employee emp2 = new Employee(2, "akhilesh2", "Khapangee", "email");
        Employee emp3 = new Employee(3, "akhilesh3", "Khapangee", "email");
        Employee emp4 = new Employee(1, "akhilesh1", "Khapangee", "email");
        Employee emp5 = new Employee(4, "akhilesh4", "Khapangee", "email");

        empDAO.add(emp1);
        empDAO.add(emp2);
        empDAO.add(emp3);
        empDAO.add(emp5);
        empDAO.add(emp1);
        
       
        
        
        for (Employee e : empDAO.getAll()) {
            System.out.println(e.getEmpId() +" "+e.getFirstName());
        }
        
        
        String firstName = "akhilesh ";
       char a = firstName.charAt(0);
        
        System.out.println(firstName.trim().substring(0, 1).toUpperCase()+firstName.trim().substring(1));

    }

}
