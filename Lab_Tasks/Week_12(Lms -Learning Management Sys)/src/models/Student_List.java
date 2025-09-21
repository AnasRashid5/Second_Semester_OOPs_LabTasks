package models;

import java.util.ArrayList;

public class Student_List {

    private ArrayList<Student> students;

    public Student_List() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);

    }

    public void removeStudent(String seat_no) {

        for (int i = 0; i < students.size(); i++) {
            // Student s=students.get(i);

            // if (s.getSeatNo().equals(seat_no)) {
            // students.remove(i);
            // }
            // or one more logic just appeared.
            if (students.get(i).getSeatNo().equals(seat_no)) {
                students.remove(i);
            }

        }

    }

    public void displayStudents() {
        System.out.println("Students List: ");
        for (Student student : students) {

            System.out.println(student);

        }
    }
}
