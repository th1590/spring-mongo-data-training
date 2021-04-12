package com.pycogroup.superblog.service;

import com.pycogroup.superblog.model.Article;
import com.pycogroup.superblog.model.Category;
import com.pycogroup.superblog.repository.ArticleRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImp implements ArticleService {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article findArticleById(String id) {
        ObjectId article_id = new ObjectId(id);
        return articleRepository.findArticleById(article_id);
    }

    @Override
    public void deactivateArticleById(String id) {
        articleRepository.deactivateById(id);
    }

    @Override
    public void activateArticleById(String id) {
        articleRepository.activateById(id);
    }

    @Override
    public void updateArticleContentById(String id, String content) {
        articleRepository.updateContentById(id, content);
    }

    @Override
    public void updateArticleTitleById(String id, String title) {
        articleRepository.updateTitleById(id, title);
    }

    @Override
    public void updateArticleCategoriesById(String id, List<Category> categories) {
        articleRepository.updateCategoriesById(id, categories);
    }
}
