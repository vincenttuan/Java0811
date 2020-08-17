package com.pcschool.ocp.d06.case2;

import com.pcschool.ocp.d06.case2.employee.Account;
import com.pcschool.ocp.d06.case2.employee.Employee;
import com.pcschool.ocp.d06.case2.employee.Manager;
import com.pcschool.ocp.d06.case2.employee.Operator;
import com.pcschool.ocp.d06.case2.employee.Sales;
import com.pcschool.ocp.d06.case2.employee.Supervistor;

public class Company2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Supervistor(),
            new Manager(),
            new Manager(),
            new Account(),
            new Account(),
            new Account(),
            new Sales(),
            new Sales(),
            new Sales(),
            new Sales(),
            new Operator(),
            new Operator(),
            new Operator(),
            new Operator(),
            new Operator(),
        };
        // 資料分析
        // 總薪資成本 = ?
        int sum = 0;
        for(Employee emp : employees) {
            sum += emp.getSalary().getMoney();
        }
        System.out.printf("總薪資成本: %,d\n", sum);
                
    }
}
