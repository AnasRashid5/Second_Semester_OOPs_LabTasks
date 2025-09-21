package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Course_List {

    private ArrayList<Course> courses;
    private Scanner sc;

    public Course_List() {
        courses = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addCourses() {
        System.out.println("Enter Number Of Your Courses :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Course Name " + (i + 1));
            String name = sc.next();

            System.out.println("Enter Course Code");
            String code = sc.next();

            Course c = new Course(name, code);
            courses.add(c);
        }
    }

    public void removeCourse(String name, String code) {
        for (int i = 0; i < courses.size(); i++) {
            // Course c=courses.get(i);

            if (courses.get(i).getName().equals(name) && courses.get(i).getCode().equals(code)) {
                courses.remove(i);
                return;
            }

        }

    }

    public void displayCourses() {
        System.out.println("Course List:");
        for (Course course : courses) {
            System.out.println(course);  //ye wala sout course wale toString ko use krega 
        }
    }

}
