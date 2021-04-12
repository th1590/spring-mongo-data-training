package com.pycogroup.superblog.repository;

import com.pycogroup.superblog.model.Category;

import java.util.List;

public interface CustomArticleRepository {
    void deactivateById(String id);

    void activateById(String id);

    void updateContentById(String id, String content);

    void updateTitleById(String id, String title);

    void updateCategoriesById(String id, List<Category> categories);
}
