package exceptionPack;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<String> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        if (!isStudentInList(studentName)) {
            students.add(studentName);
            System.out.println("Студент " + studentName + " доданий до списку.");
        } else {
            System.out.println("Студент " + studentName + " вже є у списку.");
        }
    }

    private boolean isStudentInList(String studentName){
        for (String student : students) {
            if (student.equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getStudents() {
        return students;
    }

}