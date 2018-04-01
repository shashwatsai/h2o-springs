package me.pregroup.h2o.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOTTLE")
public class Bottle {

    @Id
    @Column(name = "BOTTLE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "BOTTLE_QUANTITY")
    private String bottleQuantity; // example 40ltr

    @Column(name = "BOTTLE_BRAND")
    private String bottleBrand;

    @Column(name = "BOTTLE_PRICE")
    private int price;

    @Column(name = "BOTTLE_IMG")
    private String bottleImg;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBottleQuantity() {
        return bottleQuantity;
    }

    public void setBottleQuantity(String bottleQuantity) {
        this.bottleQuantity = bottleQuantity;
    }

    public String getBottleBrand() {
        return bottleBrand;
    }

    public void setBottleBrand(String bottleBrand) {
        this.bottleBrand = bottleBrand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBottleImg() {
        return bottleImg;
    }

    public void setBottleImg(String bottleImg) {
        this.bottleImg = bottleImg;
    }
}
