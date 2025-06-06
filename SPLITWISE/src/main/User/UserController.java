package main.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    
    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUser(String userId) {
        for (User user : userList) {
            if(user.getUserID() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUser() {
        return userList;
    }
}
