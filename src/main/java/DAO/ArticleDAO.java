/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Article;
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
public class ArticleDAO implements ArticleDAOInterface {

    Session session;
    Transaction transaction;

    @Override
    public void addArticle(Article article) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        session.save(article);
        transaction.commit();

        System.out.println("Successfully inserted");
        session.close();
    }

    @Override
    public List<Article> findArticleByDesignation(String designation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        String hql = "FROM Article WHERE designation = :designation ";
        Query query = session.createQuery(hql);
        query.setString("designation", designation);
        
        return query.getResultList();

    }

    @Override
    public List<Article> findAllAlertes() {
            
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();

        // get all products that the quantity hits a critical level (minimal quanity+10)
        String hql = "FROM Article WHERE quantity < minimalQuantity+10 ";
        Query query = session.createQuery(hql);
        
        return query.getResultList();

    }

}
