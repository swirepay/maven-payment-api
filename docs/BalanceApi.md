# BalanceApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](BalanceApi.md#getBalance) | **GET** /balance | Get balance

<a name="getBalance"></a>
# **getBalance**
> InlineResponse200 getBalance(xApiKey)

Get balance

Get balance

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BalanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BalanceApi apiInstance = new BalanceApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse200 result = apiInstance.getBalance(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceApi#getBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

