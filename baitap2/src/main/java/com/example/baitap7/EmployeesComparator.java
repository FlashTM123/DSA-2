package com.example.baitap7;

import java.util.Comparator;

public class EmployeesComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees e1, Employees e2) {
        int DepartmentCompare = e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
        if (DepartmentCompare == 0) {
            int SalaryCompare = Double.compare(e2.getSalary(), e1.getSalary());
            return SalaryCompare;
        }
        return DepartmentCompare;
        
    }
    
}
