/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author marwen
 */

@Entity
 public class Article implements Serializable {
    
    @Id
    Integer id;
    
    String designation;
    
    @ManyToMany(mappedBy = "article")
    List<Fixing> fixings;
    
    @ManyToOne
    Store store;

    public Article(Integer id, String designation, List<Fixing> fixings, Store store) {
        this.id = id;
        this.designation = designation;
        this.fixings = fixings;
        this.store = store;
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

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    
    
    
    
}
