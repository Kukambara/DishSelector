package ua.nure.dao;

import org.hibernate.Session;
import ua.nure.entity.Food;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class FoodDao extends GenericDao<Food> {

    public FoodDao() {
        super(new Food());
    }

    public List<Food> list() {
        try {
            Session session = HibernateUtilMain.getSessionFactory().openSession();
            List foods = (List) session.createQuery("from Food").list();
            session.close();
            return foods;
        } catch (Exception e) {
            System.out.println("list() Error = " + e.getCause());
        }
        return null;
    }
}
