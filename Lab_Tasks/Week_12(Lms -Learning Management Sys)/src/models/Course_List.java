package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Course_List implements Cloneable {

    private ArrayList<Course> courses;
    private Scanner sc;

    public Course_List() {
        courses = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addCourse(Course c) {
        for (Course course : courses) {
            if (course.getCode().equals(c.getCode())) {
                System.out.println("Course With Code" + c.getCode() + " Already Exists!");
                return; // Immediately exits the whole method.Ensures the duplicate course is not added.
                // BREAK::Only exits the for loop, but the method continues running.After
                // breaking, execution will move to courses.add(c); and still add the duplicate.
            }            
        }
        courses.add(c);
        System.out.println("Course with course code " + c.getCode() + " added successfully!");
    }

    public void removeCourse(String name, String code) {
        boolean removed = false;

        for (int i = 0; i < courses.size(); i++) {
            // Course c=courses.get(i);

            if (courses.get(i).getName().equalsIgnoreCase(name.trim())
                    && courses.get(i).getCode().equalsIgnoreCase(code)) {
                courses.remove(i);
                removed = true;
                System.out.println("Course "+name+" removed Successfully!");
                break;
            }
        }
        if (!removed) {
            System.out.println("Course "+name+" not found!");

        }

        // System.out.println("Course not Found!"); //this line is prinitng everytime if
        // is false.
    }

    public void searchCourse(Course c) {
        boolean search = false;
        for (Course course : courses) {
            if (course.getCode().equalsIgnoreCase(c.getCode()) && course.getName().equalsIgnoreCase(c.getName())) {
                System.out.println("Course With Code "+c.getCode()+" and name "+c.getName()+" Exists In List!");
                search = true;
                break;
            }

        }

        if (!search) {
            System.out.println("Course With Code "+c.getCode()+" and name "+c.getName()+" Not Exists In List!");

        }

    }

    public void sortByName() {
        Collections.sort(courses, Comparator.comparing(Course::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("✅ Courses sorted by name.");
    }

    // ✅ Sort by code
    public void sortByCode() {
        Collections.sort(courses, Comparator.comparing(Course::getCode, String.CASE_INSENSITIVE_ORDER));
        System.out.println("✅ Courses sorted by code.");
    }

    public void displayCourses() {
        System.out.println("Course List:");
        for (Course course : courses) {
            System.out.println(course); // ye wala sout course wale toString ko use krega
        }
    }

    @Override // this clone is making deep copy.
    public Object clone() {
        try {
            // so we addressed the below issue of clone by copying each object of course
            // arraylist independently.Now these both arraylists point to diff reference of
            // objects inside memory.Hence,truly deep copied.
            Course_List copy = (Course_List) super.clone();
            copy.courses = new ArrayList<>();
            for (Course course : courses) {
                // copy.courses.add((Course) course.clone());  //this line was the culprit behind null when printing list
                copy.courses.add(new Course(course.getName(), course.getCode()));

            }
            return copy;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // @Override // this clone is making deep but shallow copy.
    // public Object clone() { //this clone will make an independent arraylist but
    // both list will share the same object references like in this case course is
    // an object with feilds name and coureid.
    // try {
    // Course_List copy = (Course_List) super.clone();
    // copy.courses = new ArrayList<>(this.courses);
    // return copy;

    // } catch (CloneNotSupportedException e) {
    // throw new RuntimeException(e);
    // }
    // }

}
