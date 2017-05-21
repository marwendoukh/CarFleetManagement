/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Car;
import Entities.Fixing;
import Utils.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Marwen
 */
public class FixingDAO implements FixingDAOInterface {

    Session session;
    Transaction transaction;

    public FixingDAO() {

        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            transaction.isActive();
        } catch (Exception e) {
            transaction = session.beginTransaction();
        }

    }

    @Override
    public void addOrUpdateFixing(Fixing f) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        session.saveOrUpdate(f);
        transaction.commit();

        session.close();

        System.out.println("Successfully inserted");
    }

    @Override
    public List<Fixing> findFixingByYear(Integer year) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM Fixing WHERE  YEAR (fixingDate) = :year ";
        Query query = session.createQuery(hql);
        query.setInteger("year", year);

        List<Fixing> fixings = query.getResultList();

        session.close();

        return fixings;

    }

    @Override
    public List<Fixing> findFixingsByImmatriculation(String immatriculation) {

        // new DAO with get previous session (false)
        CarDAO carDao = new CarDAO(false);

        // get car by immatriculation
        Car car = carDao.getCarByImmatriculation(immatriculation);

        System.out.println("Car found " + car.getImmatriculation());

        // reopen the session (because CarDAO has closed it)
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        String hql = "FROM Fixing WHERE  car = :car ";
        Query query = session.createQuery(hql);
        query.setEntity("car", car);

        List<Fixing> fixings = query.getResultList();

        session.close();

        return fixings;

    }

    @Override
    public List<Fixing> findFixingsByDepartement(String departementName) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        // new DAO with get previous session (false)
        CarDAO carDao = new CarDAO(false);

        // get cars by departement
        List<Car> cars = carDao.getCarByDepartement(departementName);

        List<Fixing> fixings = new ArrayList<>();

        // reopen the session (because CarDAO has closed it)
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        // for each car in that departement , we will get all its fixings
        for (Car car : cars) {
            String hql = "FROM Fixing WHERE  car = :car ";
            Query query = session.createQuery(hql);
            query.setEntity("car", car);

            try {
                fixings.addAll(query.getResultList());
            } catch (NullPointerException e) {
                /// this car does not have any Fixings
            }
        }

        session.close();

        return fixings;

    }

    @Override
    public List<Fixing> findFixingsByDate(Date date) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM Fixing WHERE  fixingDate = :date ";
        Query query = session.createQuery(hql);
        query.setDate("date", date);

        List<Fixing> fixings = query.getResultList();

        session.close();

        return fixings;

    }

    @Override
    public Fixing findFixingBySoucheNumer(String soucheNum) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        Fixing fixing = session.get(Fixing.class, soucheNum);

        session.close();
        return fixing;

    }

}
