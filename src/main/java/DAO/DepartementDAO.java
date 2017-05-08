/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Article;
import Entities.Departement;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author marwen
 */
public class DepartementDAO implements DepartementDAOInterface {

    Session session;
    Transaction transaction;

    @Override
    public Departement findDepartement(String name) {

        return session.find(Departement.class, name);
    }

    
}
