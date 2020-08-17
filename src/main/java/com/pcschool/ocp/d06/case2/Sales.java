package com.pcschool.ocp.d06.case2;

import com.pcschool.ocp.d06.case2.salary.SalesSalary;

public class Sales extends Employee {

    public Sales() {
        SalesSalary salesSalary = new SalesSalary();
        setSalary(salesSalary);
    }

}
