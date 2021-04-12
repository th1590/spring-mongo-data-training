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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CreateArticleRequest;
import org.openapitools.client.model.ObjectCreationSuccessResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateArticleApi {
    private ApiClient localVarApiClient;

    public CreateArticleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CreateArticleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createArticle
     * @param createArticleRequest Create article (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create article successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createArticleCall(CreateArticleRequest createArticleRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createArticleRequest;

        // create path and map variables
        String localVarPath = "/articles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createArticleValidateBeforeCall(CreateArticleRequest createArticleRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createArticleCall(createArticleRequest, _callback);
        return localVarCall;

    }

    /**
     * Create article
     * 
     * @param createArticleRequest Create article (optional)
     * @return ObjectCreationSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create article successfully </td><td>  -  </td></tr>
     </table>
     */
    public ObjectCreationSuccessResponse createArticle(CreateArticleRequest createArticleRequest) throws ApiException {
        ApiResponse<ObjectCreationSuccessResponse> localVarResp = createArticleWithHttpInfo(createArticleRequest);
        return localVarResp.getData();
    }

    /**
     * Create article
     * 
     * @param createArticleRequest Create article (optional)
     * @return ApiResponse&lt;ObjectCreationSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create article successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ObjectCreationSuccessResponse> createArticleWithHttpInfo(CreateArticleRequest createArticleRequest) throws ApiException {
        okhttp3.Call localVarCall = createArticleValidateBeforeCall(createArticleRequest, null);
        Type localVarReturnType = new TypeToken<ObjectCreationSuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create article (asynchronously)
     * 
     * @param createArticleRequest Create article (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create article successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createArticleAsync(CreateArticleRequest createArticleRequest, final ApiCallback<ObjectCreationSuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createArticleValidateBeforeCall(createArticleRequest, _callback);
        Type localVarReturnType = new TypeToken<ObjectCreationSuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
