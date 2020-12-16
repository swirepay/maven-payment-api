/*
 * Swirepay
 * Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded request bodies, return JSON-encoded responses, and use standard HTTP response codes, authentication, and verbs. You can use the Swirepay API in test mode, which does not affect your live data or interact with the banking networks. The `API key` you use to authenticate the request determines whether the request is live mode or test mode.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swirepay.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionApi
 */
@Ignore
public class TransactionApiTest {

    private final TransactionApi api = new TransactionApi();

    /**
     * Get transaction
     *
     * Get transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionTest() throws ApiException {
        String xApiKey = null;
        InlineResponse2001 response = api.getTransaction(xApiKey);

        // TODO: test validations
    }
}
