package com.cddzmitry;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector_tutorial {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane","Jones",1234));
        employeeList.add(new Employee("John","Doe",467));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",3425));

//        System.out.println(employeeList.size());

//        employeeList.forEach(e-> System.out.println(e));

    }



}
