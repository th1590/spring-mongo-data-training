package com.pycogroup.superblog.service;

import com.pycogroup.superblog.model.Comment;
import com.pycogroup.superblog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImp implements CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImp(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentByArticleId(String articleId) {
        return commentRepository.findAllByArticleId(articleId);
    }

    @Override
    public List<Comment> getCommentByUserId(String userId) {
        return commentRepository.findAllByUserId(userId);
    }

    @Override
    public void activateCommentById(String id) {
        commentRepository.activateById(id);
    }

    @Override
    public void deactivateCommentById(String id) {
        commentRepository.deactivateById(id);
    }
}
