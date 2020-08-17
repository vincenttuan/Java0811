package com.pcschool.ocp.d06.case2;

import com.pcschool.ocp.d06.case2.salary.ManagerSalary;

public class Manager extends Employee {

    public Manager() {
        ManagerSalary managerSalary = new ManagerSalary();
        setSalary(managerSalary);
    }

}
