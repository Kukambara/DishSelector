package ua.nure.entity;

import javax.persistence.*;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"RecipeLikes\"")
public class RecipeLike {
    @Id
    @SequenceGenerator(name = "recipeLike_seq", sequenceName = "\"RecipeLikes_likedId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipeLike_seq")
    @Column(name = "\"likeId\"")
    private Integer likeId;
    @ManyToOne
    @Column(name = "\"recipeId\"")
    private Recipe recipe;
    @ManyToOne
    @Column(name = "\"userId\"")
    private User user;
    @Column(name = "\"like\"")
    private Integer like;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        if (like != null) {
            if (like > 1)
                this.like = 1;
            if (like < 0)
                this.like = 0;
        }
        this.like = like;
    }
}
