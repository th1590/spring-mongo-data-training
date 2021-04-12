# GetUserListApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserList**](GetUserListApi.md#getUserList) | **GET** /users | Get all users


<a name="getUserList"></a>
# **getUserList**
> UserListResponse getUserList()

Get all users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetUserListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    GetUserListApi apiInstance = new GetUserListApi(defaultClient);
    try {
      UserListResponse result = apiInstance.getUserList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetUserListApi#getUserList");
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

[**UserListResponse**](UserListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get user list successfully |  -  |

