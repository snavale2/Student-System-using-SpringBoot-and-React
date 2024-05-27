package com.shubham.studentsystem.service;

import com.shubham.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteStudentByName(String name);
}
