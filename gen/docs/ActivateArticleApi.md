# ActivateArticleApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateArticle**](ActivateArticleApi.md#activateArticle) | **PATCH** /articles/activate | activate article by id


<a name="activateArticle"></a>
# **activateArticle**
> ObjectUpdateSuccessResponse activateArticle(id)

activate article by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActivateArticleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ActivateArticleApi apiInstance = new ActivateArticleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ObjectUpdateSuccessResponse result = apiInstance.activateArticle(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivateArticleApi#activateArticle");
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
 **id** | **String**|  | [optional]

### Return type

[**ObjectUpdateSuccessResponse**](ObjectUpdateSuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | activate acticle successfully |  -  |

