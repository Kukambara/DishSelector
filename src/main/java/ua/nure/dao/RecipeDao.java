package ua.nure.dao;

import org.hibernate.Session;
import ua.nure.entity.Recipe;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class RecipeDao extends GenericDao<Recipe> {

    public RecipeDao() {
        super(new Recipe());
    }

    public List<Recipe> list() {
        try {
            Session session = HibernateUtilMain.getSessionFactory().openSession();
            List recipes = (List) session.createQuery("from Recipe").list();
            session.close();
            return recipes;
        } catch (Exception e) {
            System.out.println("list() Error = " + e.getCause());
        }
        return null;
    }
}
