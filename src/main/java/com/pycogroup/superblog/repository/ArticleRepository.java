package com.pycogroup.superblog.repository;

import com.pycogroup.superblog.model.Article;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, ObjectId>, CustomArticleRepository {
    Article findArticleById(ObjectId id);

    @Override
    void deactivateById(String id);

    @Override
    void activateById(String id);

    @Override
    void updateContentById(String id, String content);

    @Override
    void updateTitleById(String id, String title);
}
