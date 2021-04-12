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
import org.openapitools.client.model.CreateUserRequest;
import org.openapitools.client.model.ObjectCreationSuccessResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateUserApi
 */
@Ignore
public class CreateUserApiTest {

    private final CreateUserApi api = new CreateUserApi();

    
    /**
     * Create user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        CreateUserRequest createUserRequest = null;
        ObjectCreationSuccessResponse response = api.createUser(createUserRequest);

        // TODO: test validations
    }
    
}
