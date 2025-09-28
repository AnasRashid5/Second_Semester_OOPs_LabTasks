package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student_List implements Cloneable {

    private ArrayList<Student> students;

    public Student_List() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {

        for (Student student : students) {
            if (student.getSeatNo().equals(s.getSeatNo())) {
                System.out.println("Student "+s.getName()+" Already Added!");
            }
        }
        students.add(s);

    }

    public void removeStudent(String seat_no) {

        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getSeatNo().equals(seat_no)) {
                students.remove(i);
                removed = true;
                System.out.println("Student "+students.get(i).getSeatNo()+" removed Successfully!");
                break;
            }
            // else
            // {
            // System.out.println("Student Not Found");

            // }
        }
        if (!removed) {
            System.out.println("Student Not Exists!");
        }
    }

    public void displayStudents() {
        System.out.println("Students List: ");
        for (Student student : students) {

            System.out.println(student);

        }
    }

    public void searchStudent(Student s) {
        boolean search = false;
        for (Student student : students) {
            if (student.getSeatNo().equalsIgnoreCase(s.getSeatNo())
                    && student.getName().equalsIgnoreCase(s.getName())) {
                System.out.println("Student Exists "+s.getName()+" In List!");
                search = true;
                break;
            }

        }

        if (!search) {
            System.out.println("Student "+s.getName()+" Not Exists");

        }

    }

    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Students sorted by name successfully!");
    }

    public void sortBySeatNo() {
        Collections.sort(students, Comparator.comparing(Student::getSeatNo, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Students sorted by seat number successfully!");
    }

    // @Override
    // public Object clone() {
    //     try {
    //         return students.clone();
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //         return null;
    //     }
    // }

    @Override
public Object clone() {
    try {
        Student_List copy = (Student_List) super.clone();
        copy.students = new ArrayList<>();
        for (Student student : students) {
            copy.students.add(new Student(student.getName(), student.getSeatNo()));
        }
        return copy;
    } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
    }
}

}
