package com.pycogroup.superblog.controller;


import com.pycogroup.superblog.api.CommentsApi;
import com.pycogroup.superblog.api.model.CommentListResponseModel;
import com.pycogroup.superblog.api.model.CommentResponseModel;
import com.pycogroup.superblog.api.model.CreateCommentRequest;
import com.pycogroup.superblog.api.model.ObjectCreationSuccessResponse;
import com.pycogroup.superblog.api.model.ObjectUpdateSuccessResponse;
import com.pycogroup.superblog.model.Comment;
import com.pycogroup.superblog.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class CommentController implements CommentsApi {
    private final CommentService commentService;

    private final ModelMapper modelMapper;

    @Autowired
    public CommentController(CommentService commentService, ModelMapper modelMapper) {
        this.commentService = commentService;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> activateComment(@Valid String id) {
        commentService.activateCommentById(id);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ObjectCreationSuccessResponse> createComment(@Valid CreateCommentRequest createCommentRequest) {
        Comment comment = modelMapper.map(createCommentRequest, Comment.class);
        comment.setEnable(true);
        Comment persistComment = commentService.createComment(comment);
        ObjectCreationSuccessResponse result = new ObjectCreationSuccessResponse();
        result.setId(persistComment.getId().toString());
        result.setResponseCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> deactivateComment(@Valid String id) {
        commentService.deactivateCommentById(id);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CommentListResponseModel> findCommentsByArticleId(@Valid String articleId) {
        List<Comment> comments = commentService.getCommentByArticleId(articleId);
        return buildCommentListResponse(comments);
    }

    @Override
    public ResponseEntity<CommentListResponseModel> findCommentsByUserId(@Valid String userId) {
        List<Comment> comments = commentService.getCommentByUserId(userId);
        return buildCommentListResponse(comments);
    }

    private ResponseEntity<CommentListResponseModel> buildCommentListResponse(List<Comment> commentList) {
        CommentListResponseModel commentListResponse = new CommentListResponseModel();

        if (commentList != null) {
            commentList.forEach(item -> commentListResponse.addCommentsItem(modelMapper.map(item, CommentResponseModel.class)));
        }
        return new ResponseEntity(commentListResponse, HttpStatus.OK);
    }
}
