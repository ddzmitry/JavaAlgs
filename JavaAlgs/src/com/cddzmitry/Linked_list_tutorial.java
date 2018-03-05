package com.cddzmitry;

public class Linked_list_tutorial {


    public static void main(String[] args) {

       Employee janeJones = new Employee("Jane","Jones",1234);
       Employee johnDoe = new Employee("John","Doe",467);
       Employee marySmith = new Employee("Mary","Smith",22);
       Employee mikeWilson = new Employee("Mike","Wilson",3425);

       EmployeeLinkedList list = new EmployeeLinkedList();

//       System.out.println(list.isEmpty());
       list.addToFront(janeJones);
       list.addToFront(johnDoe);
       list.addToFront(marySmith);
       list.addToFront(mikeWilson);
//       list.printList();
//       System.out.println(list.getSize());
//       System.out.println(list.isEmpty());
//        list.removeFromFront();
//        list.removeFromFront();

        list.printList();


    }
}
