# CreateUserApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](CreateUserApi.md#createUser) | **POST** /users | Create user


<a name="createUser"></a>
# **createUser**
> ObjectCreationSuccessResponse createUser(createUserRequest)

Create user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CreateUserApi apiInstance = new CreateUserApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | Create user
    try {
      ObjectCreationSuccessResponse result = apiInstance.createUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateUserApi#createUser");
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
 **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| Create user | [optional]

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
**200** | Create user successfully |  -  |

