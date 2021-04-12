package com.pycogroup.superblog.service;

import com.pycogroup.superblog.model.Comment;
import com.pycogroup.superblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommentService {
    Comment createComment(Comment comment);

    List<Comment> getCommentByArticleId(String articleId);

    List<Comment> getCommentByUserId(String userId);

    void activateCommentById(String id);

    void deactivateCommentById(String id);
}
