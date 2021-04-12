package com.pycogroup.superblog.controller;

import com.pycogroup.superblog.api.ArticlesApi;
import com.pycogroup.superblog.api.model.ArticleListResponse;
import com.pycogroup.superblog.api.model.ArticleResponseModel;
import com.pycogroup.superblog.api.model.ObjectCreationSuccessResponse;
import com.pycogroup.superblog.api.model.CreateArticleRequest;
import com.pycogroup.superblog.api.model.ObjectUpdateSuccessResponse;
import com.pycogroup.superblog.api.model.UpdateArticleCategoriesRequest;
import com.pycogroup.superblog.api.model.UpdateArticleContentRequest;
import com.pycogroup.superblog.api.model.UpdateArticleTitleRequest;
import com.pycogroup.superblog.model.Article;
import com.pycogroup.superblog.model.Category;
import com.pycogroup.superblog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class ArticleController implements ArticlesApi {
    private final ArticleService articleService;

    private final ModelMapper modelMapper;

    @Autowired
    public ArticleController(ArticleService articleService, ModelMapper modelMapper) {
        this.articleService = articleService;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseEntity<ArticleListResponse> getArticleList() {
        List<Article> articleList = articleService.getAllArticles();
        return buildArticleListResponse(articleList);
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> updateCategories(@Valid UpdateArticleCategoriesRequest updateArticleCategoriesRequest) {
        String id = updateArticleCategoriesRequest.getId();
        List<Category> categories = new ArrayList<>();
        for (com.pycogroup.superblog.api.model.Category category : updateArticleCategoriesRequest.getCategories()) {
			categories.add(new Category(category.getName()));
        }
        articleService.updateArticleCategoriesById(id, categories);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> updateContent(@Valid UpdateArticleContentRequest updateArticleContentRequest) {
        String id = updateArticleContentRequest.getId();
        String content = updateArticleContentRequest.getContent();
        articleService.updateArticleContentById(id, content);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> updateTitle(@Valid UpdateArticleTitleRequest updateArticleTitleRequest) {
        String id = updateArticleTitleRequest.getId();
        String title = updateArticleTitleRequest.getTitle();
        articleService.updateArticleTitleById(id, title);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> activateArticle(@Valid String id) {
        articleService.activateArticleById(id);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ObjectCreationSuccessResponse> createArticle(@Valid CreateArticleRequest createArticleRequest) {
        Article article = modelMapper.map(createArticleRequest, Article.class);
        article.setEnable(true);
        Article persistArticle = articleService.createArticle(article);
        ObjectCreationSuccessResponse result = new ObjectCreationSuccessResponse();
        result.setId(persistArticle.getId().toString());
        result.setResponseCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> deactivateArticle(@Valid String id) {
        articleService.deactivateArticleById(id);
        ObjectUpdateSuccessResponse result = new ObjectUpdateSuccessResponse();
        result.setId(id);
        result.setDocument("articles");
        result.setResponseCode(HttpStatus.OK.value());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ArticleResponseModel> findArticleById(@Valid String id) {
        Article article = articleService.findArticleById(id);
        ArticleResponseModel articleResponseModel = modelMapper.map(article, ArticleResponseModel.class);
        return new ResponseEntity<>(articleResponseModel, HttpStatus.OK);
    }

    private ResponseEntity<ArticleListResponse> buildArticleListResponse(List<Article> articleList) {
        ArticleListResponse articleListResponse = new ArticleListResponse();

        if (articleList != null) {
            articleList.forEach(item -> articleListResponse.addArticlesItem(modelMapper.map(item, com.pycogroup.superblog.api.model.ArticleResponseModel.class)));
        }
        return new ResponseEntity(articleListResponse, HttpStatus.OK);
    }
}
