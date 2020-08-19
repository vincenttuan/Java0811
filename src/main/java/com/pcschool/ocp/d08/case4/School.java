package com.pcschool.ocp.d08.case4;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Person[] persons = {
            new Teacher("T1", 30, 23.3, 70000),
            new Teacher("T2", 35, 25.4, 90000),
            new Student("S1", 16, 17.5),
            new Student("S2", 17, 22.5),
            new Student("S3", 18, 24.5),
        };
        
        // 請問平均年齡 ?
        double ageAvg = Arrays.stream(persons)
                              .mapToInt(p -> p.getAge())
                              .average()
                              .getAsDouble();
        System.out.printf("平均年齡: %.2f\n", ageAvg);
        // 請問 學生 平均 BMI ?
        double bmiAvg = Arrays.stream(persons)
                              .filter(p -> p instanceof Student)
                              .mapToDouble(p -> p.getBmi())
                              .average().getAsDouble();
        System.out.printf("學生平均BMI: %.2f\n", bmiAvg);
        // 請問 Teacher 平均薪資 ?
        double salaryAvg = Arrays.stream(persons)
                                 .filter(p -> p instanceof Teacher)
                                 .map(p -> (Teacher)p)
                                 //.peek(System.out::println)
                                 .mapToInt(t -> t.getSalary().getMoney())
                                 .average()
                                 .getAsDouble();
        System.out.printf("Teacher平均薪資: %.2f\n", salaryAvg);        
                
                              
        // 將名字中有"2"的人列出
    }
}
