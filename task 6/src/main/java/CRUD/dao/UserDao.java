package CRUD.dao;

import CRUD.model.User;
import org.hibernate.mapping.List;

public interface UserDao {


        void add(User var1);

        List<User> listUsers();


}
