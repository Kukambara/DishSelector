package ua.nure.entity;

import javax.persistence.*;

/**
 * Created by Dmitry on 15.04.2014.
 */
@Entity
@Table(name = "\"RecipeTags\"")
public class RecipeTag {
    @Id
    @SequenceGenerator(name = "recipeTags_seq", sequenceName = "\"RecipeTags_recipeTagId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipeTags_seq")
    @Column(name = "\"recipeTagId\"")
    private Integer recipeTagId;
    @ManyToOne
    @Column(name = "\"recipeId\"")
    private Recipe recipe;
    @ManyToOne
    @Column(name = "\"tagId\"")
    private Tag tag;

    public Integer getRecipeTagId() {
        return recipeTagId;
    }

    public void setRecipeTagId(Integer recipeTagId) {
        this.recipeTagId = recipeTagId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
