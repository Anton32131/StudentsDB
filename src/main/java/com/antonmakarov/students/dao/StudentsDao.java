package com.antonmakarov.students.dao;

import com.antonmakarov.students.entity.Student;

import java.util.List;

public interface StudentsDao {
    public List<Student> getAllStudents();

    public void saveStudent(Student employee);

    Student getStudent(int id);

    public void deleteStudent(int id);
}
