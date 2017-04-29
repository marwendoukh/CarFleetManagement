/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.BonDeLavage;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marwen
 */
public class BonDeLavageDAO implements BonDeLavageDAOInterface {

    Session session;
    Transaction transaction;

    @Override
    public void addBonDeLavage(BonDeLavage bdl) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        session.save(bdl);
        transaction.commit();

        System.out.println("Successfully inserted");
        session.close();

    }

}
