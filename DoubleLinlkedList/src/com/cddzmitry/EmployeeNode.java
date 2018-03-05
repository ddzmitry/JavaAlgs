package com.cddzmitry;

public class EmployeeNode {

    private Employee employe;
    private EmployeeNode next;
    private EmployeeNode previous;


    public EmployeeNode(Employee employee) {
        this.employe = employee;

    }

    public Employee getEmploye() {
        return employe;
    }

    public void setEmploye(Employee employe) {
        this.employe = employe;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employe.toString();
    }
}
