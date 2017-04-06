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

    String immatriculation;

    String useType;

    Integer quantity;

    Float unitPrice;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date deliveryDate;
    
    @ManyToOne
    Car car;

}
