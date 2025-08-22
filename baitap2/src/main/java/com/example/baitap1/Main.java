package com.example.baitap1;


public class Main
{
    public static void main( String[] args )
    {
        StudentManagement stm = new StudentManagement();
        Students s1 = new Students(11, "John Doe", 8.6);
        Students s2 = new Students(12, "Jane Smith", 9.2);
        Students s3 = new Students(13, "Thu", 7.5);
        stm.addStudent(s1);
        stm.addStudent(s2);
        stm.addStudent(s3);
        stm.displayAllStudents();
    }
}
