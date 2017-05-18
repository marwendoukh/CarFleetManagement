/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Article;
import Utils.HibernateUtil;
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

    public ArticleDAO() {
         session = HibernateUtil.getSessionFactory().getCurrentSession();
        
       try{
            transaction.isActive();
        }
        catch(Exception e)
        {
            transaction = session.beginTransaction();
        }
    }
    
    
    

    @Override
    public void addArticle(Article article) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        session.save(article);
        transaction.commit();
        session.close();

        System.out.println("Successfully inserted");

    }

    @Override
    public List<Article> findArticleByDesignation(String designation) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM Article WHERE designation = :designation ";
        Query query = session.createQuery(hql);
        query.setString("designation", designation);
         
        
         List<Article> articles = query.getResultList();
         

        session.close();
        
        return articles;


    }

    @Override
    public List<Article> findAllAlertes() {
            
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        // get all products that the quantity hits a critical level (minimal quanity+10)
        String hql = "FROM Article WHERE quantity < minimalQuantity+10 ";
        Query query = session.createQuery(hql);
        
        session.close();
        
        return query.getResultList();

    }

    @Override
    public Article findArticleByCode(Integer code) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();
        
        Article article = session.get(Article.class, code);
        
        session.close();
        
        return article;
                
                
     
    }

    @Override
    public List<Article> findArticleBySupplier(String provider) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        String hql = "FROM Article WHERE provider = :provider ";
        Query query = session.createQuery(hql);
        query.setString("provider", provider);
        
        
        List<Article> articles = query.getResultList();
         

        session.close();
        
        return articles;

    }

}
