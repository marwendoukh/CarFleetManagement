/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author marwen
 */

@Entity
public class Store implements Serializable {
    
    @Id
    Integer id;

    public Store(Integer id) {
        this.id = id;
    }
    
    
    
}
