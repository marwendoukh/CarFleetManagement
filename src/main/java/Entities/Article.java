/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marwen
 */
@Entity
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String designation;

    @OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
    List<Fixing> fixings;
    
    Integer quantity;
    
    @Temporal(TemporalType.DATE)
    Date dateAchat;
    
    Integer price;
    
    Integer totalPrice;
    
    String provider;
    
    Integer minimalQuantity;
    
    String marqueArticle;
    
    

    public Article() {
    }

    public Article(Integer id, String designation, List<Fixing> fixings) {
        this.id = id;
        this.designation = designation;
        this.fixings = fixings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Fixing> getFixings() {
        return fixings;
    }

    public void setFixings(List<Fixing> fixings) {
        this.fixings = fixings;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(Integer minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public String getMarqueArticle() {
        return marqueArticle;
    }

    public void setMarqueArticle(String marqueArticle) {
        this.marqueArticle = marqueArticle;
    }
    
    

}
