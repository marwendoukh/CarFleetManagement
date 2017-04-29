/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Fixing;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface FixingDAOInterface {

    void addFixing(Fixing f);

    List<Fixing> findFixingByYear(Integer year);

}
