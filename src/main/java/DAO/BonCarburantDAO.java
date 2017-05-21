/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.BonDeCarburant;
import Utils.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author marwen
 */
public class BonCarburantDAO implements BonCarburantDAOInterface {

    Session session;
    Transaction transaction;

    public BonCarburantDAO() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            transaction.isActive();
        } catch (Exception e) {
            transaction = session.beginTransaction();
        }
    }

    @Override
    public void addBonCarburant(BonDeCarburant bonCarburant) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        session.save(bonCarburant);
        transaction.commit();

        System.out.println("Successfully inserted");
    }

    @Override
    public List<BonDeCarburant> findBonCarburantByImmatriculation(String immatriculation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM BonDeCarburant WHERE car.immatriculation = :immatriculation ";
        Query query = session.createQuery(hql);
        query.setString("immatriculation", immatriculation);

        return query.getResultList();

    }

    @Override
    public List<BonDeCarburant> findBonCarburantByUseType(String useType) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM BonDeCarburant WHERE useType = :useType ";
        Query query = session.createQuery(hql);
        query.setString("useType", useType);

        return query.getResultList();

    }

    @Override
    public List<BonDeCarburant> findBonCarburantByDate(Date date) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM BonDeCarburant WHERE deliveryDate = :date ";
        Query query = session.createQuery(hql);
        query.setDate("date", date);

        return query.getResultList();

    }

    @Override
    public BonDeCarburant findBonCarburantByNumSouche(String numSouche) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        BonDeCarburant car = session.get(BonDeCarburant.class, numSouche);

        return car;
    }

}
