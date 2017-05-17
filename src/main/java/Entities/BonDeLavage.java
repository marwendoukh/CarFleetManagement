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
public class BonDeLavage implements Serializable {

    @Id
    String bonNumber;

    String Supplier;

    Float unitPrice;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date deliveryDate;

    @ManyToOne
    Car car;
    
    String useType;

    public BonDeLavage() {
    }

    public String getBonNumber() {
        return bonNumber;
    }

    public void setBonNumber(String bonNumber) {
        this.bonNumber = bonNumber;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
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

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    
    
    
}
