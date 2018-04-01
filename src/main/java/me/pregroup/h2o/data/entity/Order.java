package me.pregroup.h2o.data.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private long id;

    @Column(name = "BOTTLE_ID")
    private long bottleId;

    @Column(name = "BUYER_ID")
    private long buyerId;

    @Column(name = "ORDER_DATE")
    private Date date;

    @Column(name = "ORDER_QUANTITY")
    private int orderQuantity;

    @Column(name = "DELIVERED")
    private int delivered;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getDelivered() {
        return delivered;
    }

    public void setDelivered(int delivered) {
        this.delivered = delivered;
    }
}
