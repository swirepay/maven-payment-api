# PaymentMethodApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPaymentMethod**](PaymentMethodApi.md#addPaymentMethod) | **POST** /payment-method | Add a payment method
[**getPaymentMethod**](PaymentMethodApi.md#getPaymentMethod) | **GET** /payment-method | Get payment methods

<a name="addPaymentMethod"></a>
# **addPaymentMethod**
> InlineResponse2005 addPaymentMethod(body, xApiKey)

Add a payment method

Adds a payment method to an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentMethodApi apiInstance = new PaymentMethodApi();
PaymentMethodRequest body = new PaymentMethodRequest(); // PaymentMethodRequest | Payment method object that needs to be added to the account
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2005 result = apiInstance.addPaymentMethod(body, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodApi#addPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentMethodRequest**](PaymentMethodRequest.md)| Payment method object that needs to be added to the account |
 **xApiKey** | **String**|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentMethod"></a>
# **getPaymentMethod**
> InlineResponse2004 getPaymentMethod(xApiKey)

Get payment methods

Get payment methods

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PaymentMethodApi apiInstance = new PaymentMethodApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.getPaymentMethod(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodApi#getPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

