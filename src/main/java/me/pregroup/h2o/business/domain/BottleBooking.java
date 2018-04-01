package me.pregroup.h2o.business.domain;

import java.util.Date;

public class BottleBooking {
    private long bottleId;
    private long buyerId;
    private String bottleBrand;
    private int orderQuantity;
    private String firstName;
    private String lastName;
    private Date date;

    public long getBottleId() {
        return bottleId;
    }

    public void setBottleId(long bottleId) {
        this.bottleId = bottleId;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public String getBottleBrand() {
        return bottleBrand;
    }

    public void setBottleBrand(String bottleBrand) {
        this.bottleBrand = bottleBrand;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
