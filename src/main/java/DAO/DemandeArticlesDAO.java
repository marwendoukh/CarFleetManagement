/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.DemandeArticle;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marwen
 */
public class DemandeArticlesDAO implements DemandeArticlesDAOInterface {

    Session session;
    Transaction transaction;


    @Override
    public void addDemandeArticles(DemandeArticle demandeArticles) {

         session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.saveOrUpdate(demandeArticles);
            transaction.commit();
            System.out.println("Successfully inserted");
            session.close();


    }

    
}
