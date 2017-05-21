/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.BonDeCarburant;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface BonCarburantDAOInterface {

    void addBonCarburant(BonDeCarburant bonCarburant);

    List<BonDeCarburant> findBonCarburantByImmatriculation(String immatriculation);

    List<BonDeCarburant> findBonCarburantByUseType(String useType);

    List<BonDeCarburant> findBonCarburantByDate(Date date);

    BonDeCarburant findBonCarburantByNumSouche(String numSouche);

}
