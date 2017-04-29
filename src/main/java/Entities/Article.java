/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author marwen
 */
@Entity
public class Article implements Serializable {

    @Id
    Integer id;

    String designation;

    @OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
    List<Fixing> fixings;

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

}
