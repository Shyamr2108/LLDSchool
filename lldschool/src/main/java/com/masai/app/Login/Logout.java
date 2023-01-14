package com.masai.app.Login;

import com.masai.app.entity.User;

public class Logout {

    public void logout(User user) {
        if (user != null) {
            System.out.println("User " + user.getUsername() + " logged out");
            user = null;
        } else {
            System.out.println("No user is currently logged in");
        }
    }
}
