package com.object.students;

import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details for Student 1");
        System.out.println("Name : ");
        String name1 = sc.next();
        System.out.println("Department : ");
        String department1 = sc.next();
        System.out.println("Enter number of subjects ");
        int numSubjects = sc.nextInt();
        int[] marks1 = new int[numSubjects];
        System.out.println("Enter marks for each subject ");
        for (int i = 0; i < numSubjects; i++) {
            marks1[i] = sc.nextInt();
        }
        System.out.println("Enter Details for Student 2");
        System.out.println("Name : ");
        String name2 = sc.next();
        System.out.println("Department : ");
        String departmemt2 = sc.next();
        System.out.println("Enter number of subjects ");
        int numSubjects2 = sc.nextInt();
        int[] marks2=new int[numSubjects2];
        System.out.println("Enter marks for each subject");
        for (int i = 0; i < numSubjects2; i++) {
            marks2[i] = sc.nextInt();
        }
        Student student1 = new Student(name1, department1);
        student1.printDetails();
        System.out.println(student1.getGrades(marks1));
        System.out.println("---------------------");
        Student student2 = new Student(name2, departmemt2);
        student2.printDetails();
        System.out.println(student2.getGrades(marks2));
    }
}