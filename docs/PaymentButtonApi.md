# PaymentButtonApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentButton**](PaymentButtonApi.md#getPaymentButton) | **GET** /payment-button | Get payment button

<a name="getPaymentButton"></a>
# **getPaymentButton**
> InlineResponse2001 getPaymentButton(xApiKey)

Get payment button

Get payment button

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentButtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentButtonApi apiInstance = new PaymentButtonApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getPaymentButton(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentButtonApi#getPaymentButton");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

