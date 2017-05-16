/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Car;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface CarDAOInterface {

    Boolean addCar(Car user);

    Car getCarByImmatriculation(String immatriculation);

    List<Car> getCarByCategory(String category);

    List<Car> getCarByUtilisation(String utilisation);

    List<Car> findAllCars();
    
    List<Car> getCarByDepartement(String departement);


}
