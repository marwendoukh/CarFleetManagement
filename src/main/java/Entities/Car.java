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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    String immatriculation;

    @ManyToOne
    Departement departement;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateDeMiseEnCirculation;

    @OneToMany(mappedBy = "car")
    List<BonDeCarburant> bonDeCarburants;

    @OneToMany(mappedBy = "car")
    List<BonDeLavage> bonDeLavages;

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
    String agenceVisiteTechnique;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateProchaineVigniette;

    Float montantVigniette;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateProchaineTaxe;

    Float montantTaxeVigniette;

    Float prixAchat;

    String concessionnaire;

    Integer indexKm;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(foreignKey = @ForeignKey, joinColumns = @JoinColumn)
    private List<Fixing> fixings;

    public Car() {
    }

    public Car(String immatriculation, Departement departement, Date dateDeMiseEnCirculation, List<BonDeCarburant> bonDeCarburants, Integer puissance, Integer nombreDePlaces, String marque, String category, Integer numDeChassis, String carburant, String utilisation, String etat, Date dateDeReforme, String compagnieDassurance, Date dateDebutDassurance, Date dateProchaineAssurance, Float montantAssurance, Date dateVisiteTechnique, Date dateProchaineVisiteTechnique, Float montantVisiteTechnique, String agenceVisiteTechnique, Date dateProchaineVigniette, Float montantVigniette, Float montantTaxeVigniette, Float prixAchat, String concessionnaire) {
        this.immatriculation = immatriculation;
        this.departement = departement;
        this.dateDeMiseEnCirculation = dateDeMiseEnCirculation;
        this.bonDeCarburants = bonDeCarburants;
        this.puissance = puissance;
        this.nombreDePlaces = nombreDePlaces;
        this.marque = marque;
        this.category = category;
        this.numDeChassis = numDeChassis;
        this.carburant = carburant;
        this.utilisation = utilisation;
        this.etat = etat;
        this.dateDeReforme = dateDeReforme;
        this.compagnieDassurance = compagnieDassurance;
        this.dateDebutDassurance = dateDebutDassurance;
        this.dateProchaineAssurance = dateProchaineAssurance;
        this.montantAssurance = montantAssurance;
        this.dateVisiteTechnique = dateVisiteTechnique;
        this.dateProchaineVisiteTechnique = dateProchaineVisiteTechnique;
        this.montantVisiteTechnique = montantVisiteTechnique;
        this.agenceVisiteTechnique = agenceVisiteTechnique;
        this.dateProchaineVigniette = dateProchaineVigniette;
        this.montantVigniette = montantVigniette;
        this.montantTaxeVigniette = montantTaxeVigniette;
        this.prixAchat = prixAchat;
        this.concessionnaire = concessionnaire;
    }

    public Integer getIndexKm() {
        return indexKm;
    }

    public void setIndexKm(Integer indexKm) {
        this.indexKm = indexKm;
    }

    public Date getDateProchaineTaxe() {
        return dateProchaineTaxe;
    }

    public void setDateProchaineTaxe(Date dateProchaineTaxe) {
        this.dateProchaineTaxe = dateProchaineTaxe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
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

    public List<BonDeCarburant> getBonDeCarburants() {
        return bonDeCarburants;
    }

    public void setBonDeCarburants(List<BonDeCarburant> bonDeCarburants) {
        this.bonDeCarburants = bonDeCarburants;
    }

    public String getAgenceVisiteTechnique() {
        return agenceVisiteTechnique;
    }

    public void setAgenceVisiteTechnique(String agenceVisiteTechnique) {
        this.agenceVisiteTechnique = agenceVisiteTechnique;
    }

    public Float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public String getConcessionnaire() {
        return concessionnaire;
    }

    public void setConcessionnaire(String concessionnaire) {
        this.concessionnaire = concessionnaire;
    }

    public List<Fixing> getFixing() {
        return fixings;
    }

    public void setFixing(List<Fixing> fixing) {
        this.fixings = fixing;
    }

    public List<BonDeLavage> getBonDeLavages() {
        return bonDeLavages;
    }

    public void setBonDeLavages(List<BonDeLavage> bonDeLavages) {
        this.bonDeLavages = bonDeLavages;
    }

    public List<Fixing> getFixings() {
        return fixings;
    }

    public void setFixings(List<Fixing> fixings) {
        this.fixings = fixings;
    }

}
