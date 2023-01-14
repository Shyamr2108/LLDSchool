package com.masai.app.Login;

import com.masai.app.Dao.UserDao;
import com.masai.app.entity.User;

public class Login {
    private UserDao userDao;
    public Login(UserDao userDao) {
        this.userDao = userDao;
    }

    public User login(String username, String password) {
        User user = userDao.getUSerByName(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("User " + username + " logged in");
            return user;
        } else {
            return null;
        }
    }
}
