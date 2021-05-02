package com.antonmakarov.students.service;

import com.antonmakarov.students.dao.StudentsDao;
import com.antonmakarov.students.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsDao studentsDao;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentsDao.getAllStudents();
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentsDao.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentsDao.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentsDao.deleteStudent(id);
    }
}
