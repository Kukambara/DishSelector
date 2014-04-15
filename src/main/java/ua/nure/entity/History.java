package ua.nure.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"Histories\"")
public class History {
    @Id
    @SequenceGenerator(name = "history_seq", sequenceName = "\"Histories_historyId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "history_seq")
    @Column(name = "\"historyId\"")
    private Integer historyId;
    @ManyToOne
    @Column(name = "\"recipeId\"")
    private Recipe recipe;
    @ManyToOne
    @Column(name = "\"userId\"")
    private User user;
    @Column(name = "\"date\"")
    private Date date;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
