package com.inter.lamb;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse iCourse = () -> {
            String[] webCourses = {"html", "css", "bootstrap"};
            return webCourses;
        };
        String[] webCourses = iCourse.showCourses();
        for (String webc : webCourses)
            System.out.println(webc);
        ICourse iCourse1 = () -> {
            String[] cloud = {"aws,googlecloud,azure"};
            return cloud;
        };
        ICourse iCourse2 = () -> {
            String[] javafullstack = {""};
            return javafullstack;

        };
    }
}
