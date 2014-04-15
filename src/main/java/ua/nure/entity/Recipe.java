package ua.nure.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"Recipes\"")
public class Recipe {
    @Id
    @SequenceGenerator(name = "recipe_seq", sequenceName = "\"Recipes_recipeId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_seq")
    @Column(name = "\"recipeId\"")
    private Integer recipeId;
    @Column(name = "\"name\"")
    private String name;
    @Column(name = "\"photo\"")
    private String photo;
    @Column(name = "\"date\"")
    private Date date;

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
