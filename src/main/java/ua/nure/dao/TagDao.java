package ua.nure.dao;

import org.hibernate.Session;
import ua.nure.entity.Tag;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class TagDao extends GenericDao<Tag> {

    public TagDao() {
        super(new Tag());
    }

    public List<Tag> list() {
        try {
            Session session = HibernateUtilMain.getSessionFactory().openSession();
            List tags = (List) session.createQuery("from Tag").list();
            session.close();
            return tags;
        } catch (Exception e) {
            System.out.println("list() Error = " + e.getCause());
        }
        return null;
    }
}
