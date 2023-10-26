package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.DaoUser;
import web.model.User;


import java.util.List;
@Service
public class ServiceUserImp implements ServiceUser {

    private final DaoUser daoUser;
    @Autowired
    public ServiceUserImp(DaoUser daoCar) {
        this.daoUser = daoCar;
    }

    @Transactional
    @Override
    public List<User> getUsers() {
        return daoUser.getUsers();
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        daoUser.saveUser(user);
    }
    @Transactional
    @Override
    public User getUser(int id) {
        return daoUser.getUser(id);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        daoUser.deleteUser(id);
    }


}


