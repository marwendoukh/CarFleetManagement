/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.BonDeLavage;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface BonDeLavageDAOInterface {

    void addBonDeLavage(BonDeLavage bdl);
    BonDeLavage findBonLavageByNumBon(String numBon);
    List<BonDeLavage> findBonLavageByImmatriculation(String immatriculation);

}
