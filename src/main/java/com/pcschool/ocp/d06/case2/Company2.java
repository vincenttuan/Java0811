package com.pcschool.ocp.d06.case2;

import com.pcschool.ocp.d06.case2.employee.Account;
import com.pcschool.ocp.d06.case2.employee.Employee;
import com.pcschool.ocp.d06.case2.employee.Manager;
import com.pcschool.ocp.d06.case2.employee.Operator;
import com.pcschool.ocp.d06.case2.employee.Sales;
import com.pcschool.ocp.d06.case2.employee.Supervistor;
import java.util.Arrays;

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
        // 資料分析 Java 7
        // 總薪資成本 = ?
        int sum = 0;
        for(Employee emp : employees) {
            sum += emp.getSalary().getMoney();
        }
        System.out.printf("總薪資成本: %,d\n", sum);
        // Sales總薪資成本 = ?        
        sum = 0;
        for(Employee emp : employees) {
            if (emp instanceof Sales) {
                sum += emp.getSalary().getMoney();
            }
        }
        System.out.printf("Sales 總薪資成本: %,d\n", sum);
        // 資料分析 Java 8
        Arrays.stream(employees)
                .forEach(e -> System.out.println(e.getSalary().getMoney()));
        
        sum = Arrays.stream(employees)
                .mapToInt(e -> e.getSalary().getMoney())
                .sum();
        System.out.printf("總薪資成本: %,d\n", sum);
    }
}
