package com.masai.app.service;

import com.masai.app.Dao.FeeDao;
import com.masai.app.Dao.StudentDao;
import com.masai.app.entity.Student;

import java.time.LocalDate;
import java.util.List;

public class Admin {

    private StudentDao student;
    private FeeDao fee;

    public Admin(StudentDao student, FeeDao fee) {
        this.student = student;
        this.fee = fee;
    }

    public List<Student> getLIstOfAllStudent(){
        return student.readAll();
    }
    public List<Student> getStudentsByClassName(String className) {
        return student.getByClass(className);
    }
    public Student getStudentDetailsById(int id) {
        return student.read(id);
    }
    public float getTotalFeesPaidThisMonth() {
        LocalDate now = LocalDate.now();
        int currentMonth = now.getMonthValue();
        int currentYear = now.getYear();
        return ((FeeDao) fee).getTotalFeesPaidThisMonth(currentMonth, currentYear);
    }
}
