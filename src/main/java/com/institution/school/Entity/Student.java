package com.institution.school.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    

    @Id
    private int student_id;
    private String name;
    private String subjects;

    protected Student() {
    }

    public Student(int student_id, String name, String subjects) {
        this.student_id = student_id;
        this.name = name;
        this.subjects = subjects;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student [student_id=" + student_id + ", name=" + name + ", subjects=" + subjects + "]";
    }

    



    
}
