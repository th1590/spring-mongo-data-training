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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.UserListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchUserByEmailApi
 */
@Ignore
public class SearchUserByEmailApiTest {

    private final SearchUserByEmailApi api = new SearchUserByEmailApi();

    
    /**
     * Search user by email
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findUserByEmailTest() throws ApiException {
        String email = null;
        UserListResponse response = api.findUserByEmail(email);

        // TODO: test validations
    }
    
}
