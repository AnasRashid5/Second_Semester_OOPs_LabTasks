package controller;

import models.Course_List;
import models.Student;
import models.Student_List;

public class App {
    
    public void run(){

        Student s1=new Student("Anas", "B24110006131");
        Student s2=new Student(s1);

        System.out.println(s1);
        s2.setName("Ashhad");
        
        System.out.println(s2);

        // Course_List c=new Course_List();
        // c.addCourses();
        // c.removeCourse("DS", "xyz");
        // c.displayCourses();

        Student_List list=new Student_List();
        //adding students 
        list.addStudent(new Student("Anas","B24110006131"));
        list.addStudent(new Student("c", "B241100061"));
        list.addStudent(new Student("B", "B24110131"));
        list.addStudent(new Student("D", "24110131"));
        list.displayStudents();
        
        //removing students 
        list.removeStudent("B24110006131");
        list.removeStudent("24110131");
        list.displayStudents();
    }
    
}
