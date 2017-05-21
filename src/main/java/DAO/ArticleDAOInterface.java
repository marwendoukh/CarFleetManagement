/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Article;
import java.util.List;

/**
 *
 * @author marwen
 */
public interface ArticleDAOInterface {

    void addOrMergeArticle(Article article);

    List<Article> findArticleByDesignation(String designation);

    List<Article> findAllAlertes();

    Article findArticleByCode(Integer code);

    List<Article> findArticleBySupplier(String provider);

}
