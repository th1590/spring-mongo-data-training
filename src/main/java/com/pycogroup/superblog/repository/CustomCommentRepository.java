package com.pycogroup.superblog.repository;

public interface CustomCommentRepository {
    void activateById(String id);

    void deactivateById(String id);
}
