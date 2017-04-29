/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author marwen
 */

@Entity 
public class Departement implements Serializable {
    
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Id
    String nom;
    
    String address;
    
    
    @OneToMany(mappedBy = "departement")
    List<Car> cars;
    
    
    @OneToMany(mappedBy = "departement")
    List<User> users;
    
}
