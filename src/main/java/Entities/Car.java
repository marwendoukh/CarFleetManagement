/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author marwen
 */
@Entity
public class Car implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Id
    @Column(name = "immatriculation")
    Integer immatriculation;

    String departement;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateDeMiseEnCirculation;
    Integer puissance;
    Integer nombreDePlaces;
    String marque;
    String category;
    Integer numDeChassis;
    String carburant;
    String utilisation;
    String etat;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateDeReforme;

    String compagnieDassurance;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateDebutDassurance;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateProchaineAssurance;
    Float montantAssurance;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateVisiteTechnique;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateProchaineVisiteTechnique;
    Float montantVisiteTechnique;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateProchaineVigniette;
    Float montantVigniette;
    Float montantTaxeVigniette;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(Integer immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Date getDateDeMiseEnCirculation() {
        return dateDeMiseEnCirculation;
    }

    public void setDateDeMiseEnCirculation(Date dateDeMiseEnCirculation) {
        this.dateDeMiseEnCirculation = dateDeMiseEnCirculation;
    }

    public Integer getPuissance() {
        return puissance;
    }

    public void setPuissance(Integer puissance) {
        this.puissance = puissance;
    }

    public Integer getNombreDePlaces() {
        return nombreDePlaces;
    }

    public void setNombreDePlaces(Integer nombreDePlaces) {
        this.nombreDePlaces = nombreDePlaces;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNumDeChassis() {
        return numDeChassis;
    }

    public void setNumDeChassis(Integer numDeChassis) {
        this.numDeChassis = numDeChassis;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public String getUtilisation() {
        return utilisation;
    }

    public void setUtilisation(String utilisation) {
        this.utilisation = utilisation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDateDeReforme() {
        return dateDeReforme;
    }

    public void setDateDeReforme(Date dateDeReforme) {
        this.dateDeReforme = dateDeReforme;
    }

    public String getCompagnieDassurance() {
        return compagnieDassurance;
    }

    public void setCompagnieDassurance(String compagnieDassurance) {
        this.compagnieDassurance = compagnieDassurance;
    }

    public Date getDateDebutDassurance() {
        return dateDebutDassurance;
    }

    public void setDateDebutDassurance(Date dateDebutDassurance) {
        this.dateDebutDassurance = dateDebutDassurance;
    }

    public Date getDateProchaineAssurance() {
        return dateProchaineAssurance;
    }

    public void setDateProchaineAssurance(Date dateProchaineAssurance) {
        this.dateProchaineAssurance = dateProchaineAssurance;
    }

    public Float getMontantAssurance() {
        return montantAssurance;
    }

    public void setMontantAssurance(Float montantAssurance) {
        this.montantAssurance = montantAssurance;
    }

    public Date getDateVisiteTechnique() {
        return dateVisiteTechnique;
    }

    public void setDateVisiteTechnique(Date dateVisiteTechnique) {
        this.dateVisiteTechnique = dateVisiteTechnique;
    }

    public Date getDateProchaineVisiteTechnique() {
        return dateProchaineVisiteTechnique;
    }

    public void setDateProchaineVisiteTechnique(Date dateProchaineVisiteTechnique) {
        this.dateProchaineVisiteTechnique = dateProchaineVisiteTechnique;
    }

    public Float getMontantVisiteTechnique() {
        return montantVisiteTechnique;
    }

    public void setMontantVisiteTechnique(Float montantVisiteTechnique) {
        this.montantVisiteTechnique = montantVisiteTechnique;
    }

    public Date getDateProchaineVigniette() {
        return dateProchaineVigniette;
    }

    public void setDateProchaineVigniette(Date dateProchaineVigniette) {
        this.dateProchaineVigniette = dateProchaineVigniette;
    }

    public Float getMontantVigniette() {
        return montantVigniette;
    }

    public void setMontantVigniette(Float montantVigniette) {
        this.montantVigniette = montantVigniette;
    }

    public Float getMontantTaxeVigniette() {
        return montantTaxeVigniette;
    }

    public void setMontantTaxeVigniette(Float montantTaxeVigniette) {
        this.montantTaxeVigniette = montantTaxeVigniette;
    }

}
