package org.example.repository;

import org.example.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class UserRepository {
    private static UserRepository INSTANCE;

    private List<User> users;

    private UserRepository(){
        this.users = new LinkedList<>();
    }

    public static synchronized UserRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new UserRepository();
        }
        return INSTANCE;
    }

    public List<User> getUsers() {
        return users.stream().sorted().toList();
    }
    public void addUser(User user){
        users.add(user);
    }
}
