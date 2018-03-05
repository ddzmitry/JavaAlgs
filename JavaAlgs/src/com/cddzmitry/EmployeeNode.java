package com.cddzmitry;

public class EmployeeNode {

    private Employee employe;
    private EmployeeNode next;

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

    @Override
    public String toString() {
        return employe.toString();
    }
}
