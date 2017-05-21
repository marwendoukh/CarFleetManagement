/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Car;
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
public class CarDAO implements CarDAOInterface {

    Session session;
    Transaction transaction;

    public CarDAO() {

        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            transaction.isActive();
        } catch (Exception e) {
            transaction = session.beginTransaction();
        }

    }

    public CarDAO(Boolean flase) {

    }

    @Override
    public Boolean addCar(Car car) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.getTransaction();

            session.save(car);
            transaction.commit();
            System.out.println("Successfully inserted");
            session.close();
            return true;
        } catch (Exception e) {
            System.out.println("Exception " + e.toString());
            session.close();
            return false;

        }

    }

    @Override
    public Car getCarByImmatriculation(String immatriculation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        Car car = session.get(Car.class, immatriculation);

        session.close();
        return car;
    }

    @Override
    public List<Car> getCarByCategory(String category) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<Car> cars = new ArrayList<>();

        try {
            String hql = "FROM Car WHERE category = :category";
            Query query = session.createQuery(hql);
            query.setString("category", category);
            cars.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        return cars;

    }

    @Override
    public List<Car> getCarByUtilisation(String utilisation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<Car> cars = new ArrayList<>();

        try {
            String hql = "FROM Car WHERE utilisation = :utilisation";
            Query query = session.createQuery(hql);
            query.setString("utilisation", utilisation);
            cars.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        return cars;
    }

    @Override
    public List<Car> findAllCars() {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        session.close();
        return session.createCriteria(Car.class).list();
    }

    @Override
    public List<Car> getCarByDepartement(String departement) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<Car> cars = new ArrayList<>();

        try {
            String hql = "FROM Car WHERE departement.nom = :departement";
            Query query = session.createQuery(hql);
            query.setString("departement", departement);
            cars.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        return cars;
    }

    @Override
    public List<Car> findAllCarsAlerts() {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<Car> cars = new ArrayList<>();

        // get alerts before 10 days of the deadline
        try {
            String hql = "FROM Car WHERE dateProchaineAssurance < CURRENT_DATE()+10 OR dateProchaineVisiteTechnique < CURRENT_DATE()+10 OR dateProchaineVigniette < CURRENT_DATE()+10";
            Query query = session.createQuery(hql);
            cars.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        return cars;

    }

}
