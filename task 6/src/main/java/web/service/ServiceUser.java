package web.service;

import web.model.User;

import java.util.List;

public interface ServiceUser {
    List<User> getUsers();
    void saveUser(User user);
    public User getUser(int id);
    void deleteUser(int id);
}