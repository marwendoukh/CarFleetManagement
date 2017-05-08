/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Car;
import Utils.HibernateUtil;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author marwen
 */
public class CarDAO implements CarDAOInterface {

    Session session;
    Transaction transaction;

    public CarDAO() {
    }

    @Override
    public Boolean addCar(Car car) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(car);
            transaction.commit();
            System.out.println("Successfully inserted");
            session.close();
            return true;
        } catch (Exception e) {
            System.out.println("Exception "+e.toString());
            session.close();
            return false;

        }

    }

    @Override
    public Car getCarByImmatriculation(Integer immatriculation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        Car car = session.get(Car.class, immatriculation);

        session.close();
        return car;
    }

    @Override
    public Car getCarByCategory(String category) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        Car car;

        try {
            String hql = "FROM Car WHERE category = :category";
            Query query = session.createQuery(hql);
            query.setString("category", category);
            car = (Car) query.getSingleResult();
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        System.out.println("car found is " + car.getMarque());
        return car;

    }

    @Override
    public Car getCarByUtilisation(String utilisation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        Car car;

        try {
            String hql = "FROM Car WHERE utilisation = :utilisation";
            Query query = session.createQuery(hql);
            query.setString("utilisation", utilisation);
            car = (Car) query.getSingleResult();
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        System.out.println("car found is " + car.getMarque());
        return car;
    }

    @Override
    public List<Car> findAllCars() {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        return session.createCriteria(Car.class).list();
    }

}
