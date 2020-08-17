package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.SupervistorSalary;

public class Supervistor extends Manager {

    public Supervistor() {
        SupervistorSalary supervistorSalary = new SupervistorSalary();
        setSalary(supervistorSalary);
    }
    
}
