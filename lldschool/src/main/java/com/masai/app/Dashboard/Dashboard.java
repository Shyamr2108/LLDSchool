package com.masai.app.Dashboard;

import com.masai.app.service.Admin;
import com.masai.app.service.Clerk;
import com.masai.app.service.Teacher;

public class Dashboard {

    private Clerk clerk;
    private Teacher teacher;
    private Admin admin;

    public Dashboard(Clerk clerk, Teacher teacher, Admin admin) {
        this.clerk = clerk;
        this.teacher = teacher;
        this.admin = admin;
    }

    public void showClerkDashboard() {
        System.out.println("Welcome");
        System.out.println("1. Add ");
        System.out.println("2. Update ");
        System.out.println("3. Add fee record ");
        System.out.println("4. View fee record of a student");
        System.out.println("5. Delete ");
        System.out.println("6. View student details class-wise");

    }

    public void showTeacherDashboard() {
        System.out.println("Welcome");
        System.out.println("1. View fee records of students");
        System.out.println("2. View student details");

    }

    public void showAdminDashboard() {
        System.out.println("Welcome");
        System.out.println("1. View details of student");
        System.out.println("2. View total sum of fee paid this month");
        System.out.println("3. View total students");
        System.out.println("4. View class-wise students");

    }
}
