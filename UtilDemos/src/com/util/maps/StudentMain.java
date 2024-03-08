package com.util.maps;

import com.util.maps.Department;
import com.util.maps.Student;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        Department department1 = new Department("AM",100,"Farhan");
        Department department2 = new Department("Infra",101,"Bhairav");
        Department department3 = new Department("Wealth",102,"Prathamesh");

        map.put(department1, Arrays.asList(new Student("Danish","Tumkur")));
        map.put(department1, Arrays.asList(new Student("Prajwal","Davangere")));
        map.put(department1, Arrays.asList(new Student("Sukanth","Bombay")));

       // Set<Map>.Entry<Department,List<Student>>> entries = map.entrySet();
        Set<Department>departments= map.keySet();
        for(Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptHead());
            List<Student>students = map.get(department);
            for (Student student:students){
                System.out.println(student.getStudName());
            }

        }
    }

}
