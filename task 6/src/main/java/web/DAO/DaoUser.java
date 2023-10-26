package web.DAO;

import web.model.User;

import java.util.List;

public interface DaoUser {
    List<User> getUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}

