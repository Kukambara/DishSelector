package ua.nure.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"Comments\"")
public class Comment {
    @Id
    @SequenceGenerator(name = "comment_seq", sequenceName = "\"Comments_commentId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
    @Column(name = "\"commentId\"")
    private Integer commentId;
    @ManyToOne
    @JoinColumn(name = "\"recipeId\"")
    private Recipe recipe;
    @Column(name = "\"text\"")
    private String text;
    @ManyToOne
    @JoinColumn(name = "\"userId\"")
    private User user;
    @Column(name = "\"date\"")
    private Date date;
    @Column(name = "\"systemIndex\"")
    private String systemIndex;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getSystemIndex() {
        return systemIndex;
    }

    public void setSystemIndex(String systemIndex) {
        this.systemIndex = systemIndex;
    }
}
