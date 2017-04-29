/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.User;
import Utils.ConnectedUser;
import Utils.HibernateUtil;
import javax.persistence.NoResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marwen
 */
public class LoginDAO implements LoginDAOInterface {

    Session session;
    Transaction transaction;

    // constructor
    public LoginDAO() {
        

    }

    // Sign in
    @Override
    public Boolean signIn(String username, String password) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        User userFoundInDB;

        try {
            String hql = "FROM User WHERE username = :username AND password=:password";
            Query query = session.createQuery(hql);
            query.setString("username", username);
            query.setString("password", password);
            userFoundInDB = (User) query.getSingleResult();
        } catch (NoResultException e) {
            session.close();
            return false;
        }
        session.close();

        ConnectedUser.setCurrentConnectedUser(userFoundInDB);
        System.out.println("connected user is " + ConnectedUser.getCurrentConnectedUser().getName());
        return userFoundInDB.getPassword().equals(password);

    }

    // sign up
    @Override
    public Boolean signUp(User user) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(user);
            transaction.commit();
            System.out.println("Successfully inserted");
            session.close();
            return true;
        } catch (Exception e) {
            session.close();
            return false;

        }
    }

}
