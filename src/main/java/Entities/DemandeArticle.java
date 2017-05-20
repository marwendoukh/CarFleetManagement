/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marwen
 */

@Entity
public class DemandeArticle implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id; 
    
    
    @OneToOne(cascade = CascadeType.ALL)
    private  Fixing fixing;
     
     @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
     private  List<Article> articles ;

     
     private Integer quanity;
     
     
     @Temporal(TemporalType.DATE)
     private Date dateDemande;
     
     
     
    public DemandeArticle() {
    }

    public Fixing getFixing() {
        return fixing;
    }

    public void setFixing(Fixing fixing) {
        this.fixing = fixing;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuanity() {
        return quanity;
    }

    public void setQuanity(Integer quanity) {
        this.quanity = quanity;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }
     
     
    
    
    
}
