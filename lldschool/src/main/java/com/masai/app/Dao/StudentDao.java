package com.masai.app.Dao;

import com.masai.app.entity.Student;

import java.util.List;

public interface StudentDao {
    void create(Student student);
    Student read(int id);
    void update(Student student);
    void delete(int id);
    List<Student> getByClass(String className);
    List<Student> readAll();


}
