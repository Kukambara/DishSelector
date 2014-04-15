package ua.nure.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"RecipeItemsList\"")
public class RecipeItem {
    @Id
    @SequenceGenerator(name = "recipeItem_seq", sequenceName = "\"RecipeItemsList_itemId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipeItem_seq")
    @Column(name = "\"itemId\"")
    private Integer itemId;
    @Column(name = "\"photo\"")
    private String photo;
    @Column(name = "\"description\"")
    private String description;
    @Column(name = "\"systemIndex\"")
    private String systemIndex;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSystemIndex() {
        return systemIndex;
    }

    public void setSystemIndex(String systemIndex) {
        this.systemIndex = systemIndex;
    }
}
