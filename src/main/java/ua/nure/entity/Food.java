package ua.nure.entity;

import javax.persistence.*;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"Foods\"")
public class Food {

    @Id
    @SequenceGenerator(name = "food_seq", sequenceName = "\"Foods_foodId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_seq")
    @Column(name = "\"foodId\"")
    private Integer foodId;
    @Column(name = "\"name\"")
    private String name;
    @Column(name = "\"calories\"")
    private Integer calories;
    @Column(name = "\"protein\"")
    private Float protein;
    @Column(name = "\"fat\"")
    private Float fat;
    @Column(name = "\"carbohydrate\"")
    private Float carbohydrate;
    @Column(name = "\"water\"")
    private Float water;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Float getProtein() {
        return protein;
    }

    public void setProtein(Float protein) {
        this.protein = protein;
    }

    public Float getFat() {
        return fat;
    }

    public void setFat(Float fat) {
        this.fat = fat;
    }

    public Float getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Float getWater() {
        return water;
    }

    public void setWater(Float water) {
        this.water = water;
    }
}
