package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.Salary;

public class Employee {

    private Salary salary;

    public Employee() {
        Salary sal = new Salary(); // 建立基本薪資物件
        setSalary(sal);
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

}
