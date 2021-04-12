# SearchUserByEmailApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUserByEmail**](SearchUserByEmailApi.md#findUserByEmail) | **GET** /users/find-by-email | Search user by email


<a name="findUserByEmail"></a>
# **findUserByEmail**
> UserListResponse findUserByEmail(email)

Search user by email

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchUserByEmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    SearchUserByEmailApi apiInstance = new SearchUserByEmailApi(defaultClient);
    String email = "email_example"; // String | 
    try {
      UserListResponse result = apiInstance.findUserByEmail(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchUserByEmailApi#findUserByEmail");
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
 **email** | **String**|  | [optional]

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Search user |  -  |

