package com.antonmakarov.students.service;

import com.antonmakarov.students.entity.Student;

import java.util.List;

public interface StudentsService {
    public List<Student> getAllStudents();

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);
}
