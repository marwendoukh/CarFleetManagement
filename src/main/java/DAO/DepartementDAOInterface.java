/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Departement;

/**
 *
 * @author marwen
 */
public interface DepartementDAOInterface {

    Departement findDepartement(String name);

    void addDepartement(String name);

}
