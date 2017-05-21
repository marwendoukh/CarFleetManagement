/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author marwen
 */
@Entity
public class BonDeCarburant implements Serializable {

    @Id
    String soucheNumber;

    String useType;

    Integer quantity;

    Float unitPrice;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date deliveryDate;

    @ManyToOne
    Car car;

    String type;

    Float bonPrice;

    public BonDeCarburant() {
    }

    public String getSoucheNumber() {
        return soucheNumber;
    }

    public void setSoucheNumber(String soucheNumber) {
        this.soucheNumber = soucheNumber;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getBonPrice() {
        return bonPrice;
    }

    public void setBonPrice(Float bonPrice) {
        this.bonPrice = bonPrice;
    }

}
