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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author marwen
 */
@Entity
public class Fixing implements Serializable {

    @Id
    String soucheNumber;

    
    @ManyToOne
    @JoinColumn(name = "immatriculation", referencedColumnName = "immatriculation", insertable = true, updatable = true)
    Car car;
    
    
	@ManyToOne
        @JoinColumn(name = "id", referencedColumnName = "id", insertable = true, updatable = true)
    Article article;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date fixingDate;
    
   
     
     String supplier;
     
   String fixingDestination;
   
   
   
    
    String designationD;
    
    
  
     @Temporal(javax.persistence.TemporalType.DATE)
    Date dateDemande;
    
     
     String responsableMission;  

    public Fixing() {
    }
     
     
     
     

    public Fixing(String soucheNumber, Car car, Article article, Date fixingDate, String supplier, String fixingDestination, String designationD, Date dateDemande, String responsableMission) {
        this.soucheNumber = soucheNumber;
        this.car = car;
        this.article = article;
        this.fixingDate = fixingDate;
        this.supplier = supplier;
        this.fixingDestination = fixingDestination;
        this.designationD = designationD;
        this.dateDemande = dateDemande;
        this.responsableMission = responsableMission;
    }
     
     
     
     
     
     
     
     
     
     

    public String getSoucheNumber() {
        return soucheNumber;
    }

    public void setSoucheNumber(String soucheNumber) {
        this.soucheNumber = soucheNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Date getFixingDate() {
        return fixingDate;
    }

    public void setFixingDate(Date fixingDate) {
        this.fixingDate = fixingDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getFixingDestination() {
        return fixingDestination;
    }

    public void setFixingDestination(String fixingDestination) {
        this.fixingDestination = fixingDestination;
    }

    public String getDesignationD() {
        return designationD;
    }

    public void setDesignationD(String designationD) {
        this.designationD = designationD;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getResponsableMission() {
        return responsableMission;
    }

    public void setResponsableMission(String responsableMission) {
        this.responsableMission = responsableMission;
    }

     
     
     
     
     

}
