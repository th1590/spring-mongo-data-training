/*
 * SuperBlog microservice API
 * API specification for SuperBlog microservice
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ArticleResponseModel;

/**
 * ArticleListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-06T15:35:42.741572300+07:00[Asia/Bangkok]")
public class ArticleListResponse {
  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<ArticleResponseModel> articles = null;


  public ArticleListResponse articles(List<ArticleResponseModel> articles) {
    
    this.articles = articles;
    return this;
  }

  public ArticleListResponse addArticlesItem(ArticleResponseModel articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<ArticleResponseModel>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * Get articles
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ArticleResponseModel> getArticles() {
    return articles;
  }


  public void setArticles(List<ArticleResponseModel> articles) {
    this.articles = articles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleListResponse articleListResponse = (ArticleListResponse) o;
    return Objects.equals(this.articles, articleListResponse.articles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleListResponse {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

