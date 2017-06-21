/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Article;
import Entities.DemandeArticle;
import Utils.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author marwen
 */
public class DemandeArticlesDAO implements DemandeArticlesDAOInterface {

    Session session;
    Transaction transaction;

    public DemandeArticlesDAO() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            transaction.isActive();
        } catch (Exception e) {
            transaction = session.beginTransaction();
        }
    }

    @Override
    public void addDemandeArticles(DemandeArticle demandeArticles) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        session.saveOrUpdate(demandeArticles);
        transaction.commit();
        System.out.println("Successfully inserted");
        session.close();

    }

    @Override
    public List<DemandeArticle> findDemandeArticlesByMarqueArticle(String marqueArticle) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<DemandeArticle> demandesArticles = new ArrayList<>();

        try {

            String hql = "FROM DemandeArticle  da  JOIN FETCH da.articles  das WHERE das.marqueArticle=:marqueArticle";
            Query query = session.createQuery(hql);
            query.setString("marqueArticle", marqueArticle);
            demandesArticles.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        System.out.println("dem article found " + demandesArticles.get(0).getClass().getName());

        return demandesArticles;

    }

    @Override
    public List<DemandeArticle> findDemandeArticlesByResponsable(String responsable) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<DemandeArticle> demandesArticles = new ArrayList<>();

        try {

            String hql = "FROM DemandeArticle  WHERE fixing.responsableMission=:responsableMission";
            Query query = session.createQuery(hql);
            query.setString("responsableMission", responsable);
            demandesArticles.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        System.out.println("dem article found " + demandesArticles.get(0).getClass().getName());

        return demandesArticles;

    }

    @Override
    public List<DemandeArticle> findDemandeArticlesByDate(Date date) {

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.getTransaction();

        List<DemandeArticle> demandesArticles = new ArrayList<>();

        try {

            String hql = "FROM DemandeArticle  WHERE dateDemande=:dateDemande";
            Query query = session.createQuery(hql);
            query.setDate("dateDemande", date);
            demandesArticles.addAll(query.getResultList());
        } catch (NoResultException e) {
            session.close();
            return null;
        }
        session.close();

        System.out.println("dem article found " + demandesArticles.get(0).getClass().getName());

        return demandesArticles;

    }

    @Override
    public void acceptDemandeArticle(DemandeArticle demandeArticle) {

        // close the current session because ArticleDao will start a new one
        session.evict(demandeArticle.getFixing());
        session.flush();
        session.clear();
        session.close();
        
        System.out.println("demande Article to delete "+demandeArticle.getId());
        ArticleDAO articleDao = new ArticleDAO();
      Article article=  articleDao.findArticleByDesignation(demandeArticle.getArticles().get(0).getDesignation()).get(0);

      Integer remainingQuantity=article.getQuantity()-demandeArticle.getQuanity();
      article.setQuantity(remainingQuantity);
      
      
      
      if(article.getFixings().indexOf(this) != -1)
      {
         article.getFixings().set(article.getFixings().indexOf(this), demandeArticle.getFixing());
      }
      else
      {
          article.getFixings().add(demandeArticle.getFixing());
      }
        // reopen the session (because ArticleDao has closed it)
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        
        session.flush();
        session.clear();
        
      articleDao.addOrMergeArticle(article);
      
      
       // reopen the session (because CarDAO has closed it)
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        
        session.delete(demandeArticle);
        transaction.commit();

        
        session.close();
    }
    
    @Override
    public void rejectDemandeArticle(DemandeArticle demandeArticle) {

        // close the current session because ArticleDao will start a new one
        session.evict(demandeArticle.getFixing());
        session.flush();
        session.clear();
        session.close();
        
        System.out.println("demande Article to delete "+demandeArticle.getId());
       
      
       // reopen the session (because CarDAO has closed it)
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        
        session.delete(demandeArticle);
        transaction.commit();

        
        session.close();
    }

}
