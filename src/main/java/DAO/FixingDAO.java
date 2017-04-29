/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Fixing;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author marwen
 */
public class FixingDAO implements FixingDAOInterface {

    Session session;
    Transaction transaction;

    @Override
    public void addFixing(Fixing f) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        session.save(f);
        transaction.commit();

        System.out.println("Successfully inserted");
        session.close();
    }

    @Override
    public List<Fixing> findFixingByYear(Integer year) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        String hql = "FROM Fixing WHERE  YEAR (fixingDate) = :year ";
        Query query = session.createQuery(hql);
        query.setInteger("year", year);

        return query.getResultList();

    }

}
