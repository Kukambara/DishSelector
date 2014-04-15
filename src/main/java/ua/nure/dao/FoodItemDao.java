package ua.nure.dao;

import org.hibernate.Session;
import ua.nure.entity.FoodItem;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class FoodItemDao extends GenericDao<FoodItem> {

    public FoodItemDao() {
        super(new FoodItem());
    }
}
