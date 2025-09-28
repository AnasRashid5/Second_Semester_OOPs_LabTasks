package controller;

// import models.Course;
// import models.Course_List;
// import models.Student;
// import models.Student_List;

// public class App {
    
//     public void run(){

        // Student s1=new Student("Anas", "B24110006131");
        // Student s2=(Student)s1.clone();
        // Student s3=new Student("Yahya", "B24110006666");
        

        // s2.setName("Ashhad");

        // Student_List sl=new Student_List();
        // sl.addStudent(s2);
        // sl.searchStudent(s3);
        // sl.searchStudent(s1);
        // Course c=new Course("DS","CS-359");
        // Course c2=new Course("OOP","CS-333");

        // c2.setCode("CS-331");

        // System.out.println(c);
        // System.out.println(c2);

        // System.out.println(s2);
        // System.out.println(s1);
        
        

        // Course_List c=new Course_List();
        
        // Course_List c2=(Course_List)c.clone();
        // c.addCourses();
        // c2.removeCourse("DS", "CS-359");
        // // c.removeCourse("DS", "xyz");
        // c.displayCourses();
        // c.displayCourses();

        // Student_List list=new Student_List();
        // // adding students 
        // list.addStudent(new Student("Anas","B24110006131"));
        // list.addStudent(new Student("c", "B241100061"));
        // list.addStudent(new Student("B", "B24110131"));
        // list.addStudent(new Student("D", "24110131"));
        // list.displayStudents();
        
        // // removing students 
        // list.removeStudent("B24110006131");
        // list.removeStudent("24110131");
        // list.displayStudents();


//     }
    
// }

import controller.App;
import models.Course;
import models.Course_List;
import models.Student;
import models.Student_List;

public class App {
    public void run() {

        System.out.println("===================================");
        System.out.println("        🎓 MINI LMS SYSTEM        ");
        System.out.println("===================================");

        // ===============================
        // COURSES DEMO
        // ===============================
        System.out.println("\n--- 📚 COURSE MODULE DEMO ---");

        Course_List courseList = new Course_List();

        // Adding Courses
        courseList.addCourse(new Course("Data Structures", "CS-359"));
        courseList.addCourse(new Course("OOP", "CS-333"));
        courseList.addCourse(new Course("DBMS", "CS-401"));
        courseList.addCourse(new Course("DBMS", "CS-401")); // duplicate test

        // Display
        courseList.displayCourses();

        // Search
        courseList.searchCourse(new Course("OOP", "CS-333"));
        courseList.searchCourse(new Course("AI", "CS-999"));

        // Remove
        courseList.removeCourse("OOP", "CS-333");
        courseList.removeCourse("AI", "CS-999");

        // Sorting
        courseList.sortByName();
        courseList.displayCourses();
        courseList.sortByCode();
        courseList.displayCourses();

        // ===============================
        // STUDENTS DEMO
        // ===============================
        System.out.println("\n--- 🧑‍🎓 STUDENT MODULE DEMO ---");

        Student_List studentList = new Student_List();

        studentList.addStudent(new Student("Anas", "B24110006131"));
        studentList.addStudent(new Student("Ali", "B24110006132"));
        studentList.addStudent(new Student("Sara", "B24110006133"));
        studentList.addStudent(new Student("Anas", "B24110006131")); // duplicate

        // Display
        studentList.displayStudents();

        // Search
        studentList.searchStudent(new Student("Sara", "B24110006133"));
        studentList.searchStudent(new Student("John", "B999999"));

        // Remove
        studentList.removeStudent("B24110006132"); // exists
        studentList.removeStudent("B999999"); // not exists

        // Display again
        studentList.displayStudents();

        // ===============================
        // CLONING DEMO
        // ===============================
        System.out.println("\n--- 🌀 CLONING DEMO ---");

        // Shallow copy demo
        System.out.println("\n>> Shallow Copy Test (Students)");
        Student_List shallowCopy =(Student_List)studentList.clone();
        System.out.println("Original Student List:");
        studentList.displayStudents();
        System.out.println("Shallow Copied Student List:");
        System.out.println(shallowCopy); // will show only reference behavior

        // Deep copy demo
        System.out.println("\n>> Deep Copy Test (Courses)");
        Course_List deepCopy = (Course_List) courseList.clone();
        System.out.println("Original Course List:");
        courseList.displayCourses();
        System.out.println("Deep Copied Course List:");
        deepCopy.displayCourses();

        // Modify deep copy to test independence
        deepCopy.removeCourse("Data Structures", "CS-359");
        System.out.println("After removing from deep copy:");
        System.out.println("Original Course List:");
        courseList.displayCourses();
        System.out.println("Deep Copied Course List:");
        deepCopy.displayCourses();

        System.out.println("\n===================================");
        System.out.println("   ✅ LMS DEMO EXECUTION COMPLETE  ");
        System.out.println("===================================");
    }
}
