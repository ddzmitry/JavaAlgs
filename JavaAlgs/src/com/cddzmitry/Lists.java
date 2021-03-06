package com.cddzmitry;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lists {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Jane","Jones",1234));
        employeeList.add(new Employee("John","Doe",467));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",3425));

//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1,new Employee("John","Adams",4568));
//        employeeList.forEach(employee -> System.out.println(employee));
//        employeeList.add(new Employee("John","Doe",467));
        employeeList.add(3,new Employee("John","Doe",4567));

//        employeeList.forEach(employee -> System.out.println(employee));

//        this is to Object array
//        Object[] employeeArray = employeeList.toArray();
//to actual array
        Object[] employeeArr = employeeList.toArray(new Employee[employeeList.size()]);
//
//        for (Object employee : employeeArr) {
//            System.out.println(employee);
//        }


//        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));

//        System.out.println(employeeList.indexOf(new Employee("Mary","Smith",22)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
