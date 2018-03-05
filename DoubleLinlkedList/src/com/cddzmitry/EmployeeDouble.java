package com.cddzmitry;


public class EmployeeDouble {


    private EmployeeNode head;
    private EmployeeNode tail;

    private int size;


    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode (employee);
        node.setNext(head);

        if(head == null){
            tail = node;
        }
        else {
            head.setPrevious(node);
        }

        head = node;
        size++;


    }

    public void addToEnd(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size ++;

    }
    public  EmployeeNode removeFromEnd(){

        if (isEmpty()){
            return null;
        }

        EmployeeNode RemovedNode = tail;

        if (tail.getPrevious() == null){
            head = null;
        } else{

            tail.getPrevious().setNext(null);

        }

        tail = tail.getPrevious();
        size --;
        RemovedNode.setNext(null);
        RemovedNode.setPrevious(null);
        return RemovedNode;

    }

    public boolean addBefore(Employee newEmployee,Employee existingEmployee){

        /*
        * Return true if were able to add employee
        * into list before the existing employee
        * Rerutn false if exisiting employee Doesnt existis in the list
        * */

        if(isEmpty()){
            return false;
        }
//        find existing employee
        EmployeeNode current = head;

        while (current !=null && !current.getEmploye().equals(existingEmployee)){

            current = current.getNext();

        }
//        no employee found
        if (current == null){
            return false;
        }
//        refactor current employee
        EmployeeNode newNode = new EmployeeNode(newEmployee);
//        setting
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current){
            head = newNode;
        }else {

            newNode.getPrevious().setNext(newNode);
        }

        size ++;
        return true;
    }

    public  EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode RemovedNode = head;

        if(head.getNext() == null){
            tail = null;

        } else{

            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size --;
        RemovedNode.setNext(null);
        return RemovedNode;

    }
    public  int  getSize(){
        return size;
    }
    public boolean isEmpty(){
        return  head == null;
    }
    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while (current != null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
