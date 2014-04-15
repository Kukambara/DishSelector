package ua.nure.dao;

import ua.nure.entity.RecipeTag;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class RecipeTegDao extends GenericDao<RecipeTag> {

    public RecipeTegDao() {
        super(new RecipeTag());
    }
}
