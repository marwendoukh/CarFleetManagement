/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.BonDeLavage;
import Utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author marwen
 */
public class BonDeLavageDAO implements BonDeLavageDAOInterface {

    Session session;
    Transaction transaction;

    public BonDeLavageDAO() {

        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            transaction.isActive();
        } catch (Exception e) {
            transaction = session.beginTransaction();
        }

    }

    @Override
    public void addBonDeLavage(BonDeLavage bdl) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        transaction = session.getTransaction();

        session.save(bdl);
        transaction.commit();

        System.out.println("Successfully inserted");
        session.close();

    }

    @Override
    public List<BonDeLavage> findBonLavageByImmatriculation(String immatriculation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        transaction = session.getTransaction();

        List<BonDeLavage> bonLavages = new ArrayList<>();

        try {
            String hql = "FROM BonDeLavage WHERE car.immatriculation = :immatriculation";
            Query query = session.createQuery(hql);
            query.setString("immatriculation", immatriculation);
            bonLavages.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        return bonLavages;
    }

    @Override
    public BonDeLavage findBonLavageByNumBon(String numBon) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        transaction = session.getTransaction();

        BonDeLavage bonLavage = session.get(BonDeLavage.class, numBon);

        session.close();
        return bonLavage;

    }

}
