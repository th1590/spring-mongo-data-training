# CreateArticleApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createArticle**](CreateArticleApi.md#createArticle) | **POST** /articles | Create article


<a name="createArticle"></a>
# **createArticle**
> ObjectCreationSuccessResponse createArticle(createArticleRequest)

Create article

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateArticleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CreateArticleApi apiInstance = new CreateArticleApi(defaultClient);
    CreateArticleRequest createArticleRequest = new CreateArticleRequest(); // CreateArticleRequest | Create article
    try {
      ObjectCreationSuccessResponse result = apiInstance.createArticle(createArticleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateArticleApi#createArticle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createArticleRequest** | [**CreateArticleRequest**](CreateArticleRequest.md)| Create article | [optional]

### Return type

[**ObjectCreationSuccessResponse**](ObjectCreationSuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Create article successfully |  -  |

