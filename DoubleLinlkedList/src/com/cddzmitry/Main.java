package com.cddzmitry;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee janeJones = new Employee("Jane","Jones",1234);
        Employee johnDoe = new Employee("John","Doe",467);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3425);
        Employee dzmitryDubarau = new Employee("Dzmitry","Dubarau",25);
        EmployeeDouble list = new EmployeeDouble();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
//        list.addToEnd(dzmitryDubarau);
//        list.removeFromFront();
//        list.removeFromEnd();

            list.printList();
        System.out.println(list.getSize());
        list.addBefore(dzmitryDubarau,marySmith);

        list.printList();
        System.out.println(list.getSize());


    }
}
