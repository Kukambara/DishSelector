package ua.nure.entity;

import javax.persistence.*;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"FoodItemsList\"")
public class FoodItem {
    @Id
    @SequenceGenerator(name = "foodItems_seq", sequenceName = "\"FoodItemsList_likeId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foodItems_seq")
    @Column(name = "\"itemId\"")
    private Integer itemId;
    @Column(name = "\"foodId\"")
    private Integer foodId;
    @Column(name = "\"count\"")
    private Integer count;
    @Column(name = "\"mass\"")
    private Integer mass;
    @Column(name = "\"amount\"")
    private Integer amount;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
