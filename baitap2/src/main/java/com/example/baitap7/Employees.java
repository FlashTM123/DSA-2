package com.example.baitap7;

public class Employees {
    private String nameEmployee;
    private String department;
    private double salary;
    public Employees(String nameEmployee, String department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
    }
    public String getNameEmployee() {
        return nameEmployee;
    }
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employees [nameEmployee=" + nameEmployee + ", department=" + department + ", salary=" + salary + "]";
    }
    
}
