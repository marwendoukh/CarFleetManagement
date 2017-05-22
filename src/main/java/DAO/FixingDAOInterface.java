/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Car;
import Entities.Fixing;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface FixingDAOInterface {

    void addOrUpdateFixing(Fixing f);

    List<Fixing> findFixingByYear(Integer year);

    List<Fixing> findFixingsByImmatriculation(String immatriculation);

    List<Fixing> findFixingsByDepartement(String departementName);

    List<Fixing> findFixingsByDate(Date date);

    Fixing findFixingBySoucheNumer(String soucheNum);

    List<Fixing> findAllFixingAlerts();
    
    List<Car> findCoutKilometrique();

}
