package com.example.baitap1;

public class StudentManagement {
   private Students[] students;
   private int StudentCounts;
   private final int MAX_STUDENTS = 100;

   public StudentManagement(){
        students = new Students[MAX_STUDENTS];
        StudentCounts = 0;
   }

   public void addStudent(Students student){
        if (StudentCounts < MAX_STUDENTS) {
            students[StudentCounts++] = student;
        } else {
            System.out.println("Overlood");
        }
   }

   public void displayAllStudents(){
     if (StudentCounts == 0) {
          System.out.println("Not Found");
     } else {
          for (int i = 0; i < StudentCounts; i++) {
               System.out.println(students[i]);
          }
     }
   }
}
