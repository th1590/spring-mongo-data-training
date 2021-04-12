package com.pycogroup.superblog.repository;

import com.pycogroup.superblog.model.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, ObjectId>, CustomCommentRepository {
    List<Comment> findAllByArticleId(String articleId);

    List<Comment> findAllByUserId(String userId);

    @Override
    void activateById(String id);

    @Override
    void deactivateById(String id);
}
