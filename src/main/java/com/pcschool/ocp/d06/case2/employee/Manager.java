package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.employee.Employee;
import com.pcschool.ocp.d06.case2.salary.ManagerSalary;

public class Manager extends Employee {

    public Manager() {
        ManagerSalary managerSalary = new ManagerSalary();
        setSalary(managerSalary);
    }

}
