package ua.nure.dao;

import ua.nure.entity.RecipeItem;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class RecipeItemDao extends GenericDao<RecipeItem> {

    public RecipeItemDao() {
        super(new RecipeItem());
    }
}
