# PaymentSessionApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentSession**](PaymentSessionApi.md#getPaymentSession) | **GET** /payment-session | Get payment sessions

<a name="getPaymentSession"></a>
# **getPaymentSession**
> InlineResponse2006 getPaymentSession(xApiKey)

Get payment sessions

Get payment sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentSessionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentSessionApi apiInstance = new PaymentSessionApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.getPaymentSession(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSessionApi#getPaymentSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

