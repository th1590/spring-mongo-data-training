package com.pycogroup.superblog.repository;

import com.pycogroup.superblog.model.Article;
import com.pycogroup.superblog.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public class CustomArticleRepositoryImpl implements CustomArticleRepository {
    private MongoTemplate mongoTemplate;

    @Autowired
    public CustomArticleRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void deactivateById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("enable", false);
        mongoTemplate.updateFirst(query, update, Article.class);
    }

    @Override
    public void activateById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("enable", true);
        mongoTemplate.updateFirst(query, update, Article.class);
    }

    @Override
    public void updateContentById(String id, String content) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("content", content);
        mongoTemplate.updateFirst(query, update, Article.class);
    }

    @Override
    public void updateTitleById(String id, String title) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("title", title);
        mongoTemplate.updateFirst(query, update, Article.class);
    }

    @Override
    public void updateCategoriesById(String id, List<Category> categories) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("categories", categories);
        mongoTemplate.updateFirst(query, update, Article.class);
    }
}
