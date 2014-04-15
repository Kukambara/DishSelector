package ua.nure.dao;

import org.hibernate.Session;
import ua.nure.entity.FoodLike;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class FoodLikeDao extends GenericDao<FoodLike> {

    public FoodLikeDao() {
        super(new FoodLike());
    }

}
