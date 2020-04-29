package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class University {
    private List<Student> students ;
    String name;
    int age;




    public University(String name, int age) {
        this.name = name;
        this.age = age;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    public Student getStudentWithAverageGrade(double averageGrade) {
        Student stud = null;
        for (Student student:
                students) {
            if (student.getAverageGrade() == averageGrade){
                stud = student;
            }
        }
        return stud;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxAverage = 0.0;
        for (Student student :
                students) {
           if ( student.getAverageGrade() > maxAverage){
               maxAverage = student.getAverageGrade();
           }
        }
        return getStudentWithAverageGrade(maxAverage);
    }

    public Student getStudentWithMinAverageGrade()  {
        double minAverage = students.get(0).getAverageGrade();

        for (Student student:
                students) {
            if (student.getAverageGrade() < minAverage) {
                minAverage = student.getAverageGrade();
            }
        }
        return getStudentWithAverageGrade(minAverage);
    }
    public void expel(Student student){
        students.removeIf(student::equals);
    }
}
