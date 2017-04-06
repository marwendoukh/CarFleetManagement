/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    Car car;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date fixingDate;
    
    Integer index;
    
    String useType;
    
    String fixingType;
    
    Float fixingPrice;
    
    String visiteTechniqueAgency;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date visiteTechniqueDate;
    
     @Temporal(javax.persistence.TemporalType.DATE)
    Date nextVisiteDate;
    
     
     Float totalPriceVisite;
     
     String supplier;
     
     @OneToMany
    List<Article> article;

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

    public Date getFixingDate() {
        return fixingDate;
    }

    public void setFixingDate(Date fixingDate) {
        this.fixingDate = fixingDate;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getFixingType() {
        return fixingType;
    }

    public void setFixingType(String fixingType) {
        this.fixingType = fixingType;
    }

    public Float getFixingPrice() {
        return fixingPrice;
    }

    public void setFixingPrice(Float fixingPrice) {
        this.fixingPrice = fixingPrice;
    }

    public String getVisiteTechniqueAgency() {
        return visiteTechniqueAgency;
    }

    public void setVisiteTechniqueAgency(String visiteTechniqueAgency) {
        this.visiteTechniqueAgency = visiteTechniqueAgency;
    }

    public Date getVisiteTechniqueDate() {
        return visiteTechniqueDate;
    }

    public void setVisiteTechniqueDate(Date visiteTechniqueDate) {
        this.visiteTechniqueDate = visiteTechniqueDate;
    }

    public Date getNextVisiteDate() {
        return nextVisiteDate;
    }

    public void setNextVisiteDate(Date nextVisiteDate) {
        this.nextVisiteDate = nextVisiteDate;
    }

    public Float getTotalPriceVisite() {
        return totalPriceVisite;
    }

    public void setTotalPriceVisite(Float totalPriceVisite) {
        this.totalPriceVisite = totalPriceVisite;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }

    public Fixing(String soucheNumber, Car car, Date fixingDate, Integer index, String useType, String fixingType, Float fixingPrice, String visiteTechniqueAgency, Date visiteTechniqueDate, Date nextVisiteDate, Float totalPriceVisite, String supplier, List<Article> article) {
        this.soucheNumber = soucheNumber;
        this.car = car;
        this.fixingDate = fixingDate;
        this.index = index;
        this.useType = useType;
        this.fixingType = fixingType;
        this.fixingPrice = fixingPrice;
        this.visiteTechniqueAgency = visiteTechniqueAgency;
        this.visiteTechniqueDate = visiteTechniqueDate;
        this.nextVisiteDate = nextVisiteDate;
        this.totalPriceVisite = totalPriceVisite;
        this.supplier = supplier;
        this.article = article;
    }
     
     
     
     

}
