/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.DemandeArticle;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface DemandeArticlesDAOInterface {

    void addDemandeArticles(DemandeArticle demandeArticles);
    List<DemandeArticle> findDemandeArticlesByMarqueArticle(String marqueArticle);
    List<DemandeArticle> findDemandeArticlesByResponsable(String responsable);
    List<DemandeArticle> findDemandeArticlesByDate(Date date);



    

}
