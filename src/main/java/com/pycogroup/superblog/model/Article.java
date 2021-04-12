package com.pycogroup.superblog.model;

import com.querydsl.core.annotations.QueryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Document(collection = "articles")
@Builder
@QueryEntity
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	@Id
	@Getter
	private ObjectId id;

	@Getter
	@Setter
	private String title;

	@Getter
	@Setter
	private String content;

	@Getter
	@Setter
	private String authorId;

	@Getter
	@Setter
	private Boolean enable;

	@Getter
	@Setter
	private List<Category> categories;
}
