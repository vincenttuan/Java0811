package com.pcschool.ocp.d06.case2;

import com.pcschool.ocp.d06.case2.employee.Sales;
import com.pcschool.ocp.d06.case2.employee.Manager;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.getSalary().getMoney());
        Sales sales = new Sales();
        System.out.println(sales.getSalary().getMoney());
    }
}
