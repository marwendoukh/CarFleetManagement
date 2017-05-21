/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Departement;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marwen
 */
public class DepartementDAO implements DepartementDAOInterface {

    Session session;
    Transaction transaction;

    @Override
    public Departement findDepartement(String name) {

        Departement dep = null;
        try {
            dep = session.find(Departement.class, name);

        } catch (Exception e) {
            return null;
        }
        session.close();
        return dep;
    }

    @Override
    public void addDepartement(String name) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        Departement dep = new Departement();
        dep.setNom(name);
        session.save(dep);
        transaction.commit();
        System.out.println("Successfully inserted");
        session.close();
    }

}
