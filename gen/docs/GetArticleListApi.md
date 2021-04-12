# GetArticleListApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArticleList**](GetArticleListApi.md#getArticleList) | **GET** /articles | Get all articles


<a name="getArticleList"></a>
# **getArticleList**
> ArticleListResponse getArticleList()

Get all articles

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetArticleListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    GetArticleListApi apiInstance = new GetArticleListApi(defaultClient);
    try {
      ArticleListResponse result = apiInstance.getArticleList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetArticleListApi#getArticleList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ArticleListResponse**](ArticleListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get article list successfully |  -  |

