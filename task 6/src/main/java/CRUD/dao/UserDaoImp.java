package CRUD.dao;

import CRUD.model.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {

    @Autowired
  private EntityManager em;

    public UserDaoImp() {
    }

    public void add(User user) {
        em.getCurrentSession().save(user);
    }

    public List<User> listUsers() {
        TypedQuery<User> query = this.sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }


}


