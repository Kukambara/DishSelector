package ua.nure.dao;


import org.hibernate.Session;
import ua.nure.entity.User;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class UserDao extends GenericDao<User> {

    public UserDao() {
        super(new User());
    }

    public List<User> list() {
        try {
            Session session = HibernateUtilMain.getSessionFactory().openSession();
            List categories = (List) session.createQuery("from User").list();
            session.close();
            return categories;
        } catch (Exception e) {
            System.out.println("list() Error = " + e.getCause());
        }
        return null;
    }
}
