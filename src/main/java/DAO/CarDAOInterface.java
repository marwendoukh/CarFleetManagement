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

    Car getCarByImmatriculation(Integer immatriculation);

    Car getCarByCategory(String category);

    Car getCarByUtilisation(String utilisation);

    List<Car> findAllCars();

}
