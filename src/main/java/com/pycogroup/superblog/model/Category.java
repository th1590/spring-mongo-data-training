package com.pycogroup.superblog.model;

import com.querydsl.core.annotations.QueryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@QueryEntity
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Getter
    @Setter
    private String name;
}
