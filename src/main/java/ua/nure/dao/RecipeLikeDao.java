package ua.nure.dao;

import ua.nure.entity.RecipeLike;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class RecipeLikeDao extends GenericDao<RecipeLike> {

    public RecipeLikeDao() {
        super(new RecipeLike());
    }
}
