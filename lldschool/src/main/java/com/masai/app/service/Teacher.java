package com.masai.app.service;

import com.masai.app.Dao.FeeDao;
import com.masai.app.Dao.StudentDao;
import com.masai.app.entity.FeeRecord;
import com.masai.app.entity.Student;

import java.util.List;

public class Teacher {
    private StudentDao studentDao;
    private FeeDao feeDao;

    public Teacher(StudentDao studentDao) {
        this.studentDao = studentDao;
        this.feeDao = feeDao;
    }

    public void createStudent(Student student) {
        studentDao.create(student);
    }

    public Student readStudent(int id) {
        return studentDao.read(id);
    }

    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    public void deleteStudent(int id) {
        studentDao.delete(id);
    }

    public List<Student> getStudentDetailsByClass(String className) {
        return studentDao.getByClass(className);
    }

    public List<FeeRecord> getFeeRecordByClass(String className) {
        return feeDao.getByClass(className);
    }
}
