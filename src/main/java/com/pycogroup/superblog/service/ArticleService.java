package com.pycogroup.superblog.service;

import com.pycogroup.superblog.model.Article;
import com.pycogroup.superblog.model.Category;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles();

    Article createArticle(Article article);

    Article findArticleById(String id);

    void deactivateArticleById(String id);

    void activateArticleById(String id);

    void updateArticleContentById(String id, String content);

    void updateArticleTitleById(String id, String title);

    void updateArticleCategoriesById(String id, List<Category> categories);
}
