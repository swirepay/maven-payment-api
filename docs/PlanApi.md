# PlanApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlan**](PlanApi.md#getPlan) | **GET** /plan | Get plan

<a name="getPlan"></a>
# **getPlan**
> InlineResponse2001 getPlan(xApiKey)

Get plan

Get plan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlanApi apiInstance = new PlanApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getPlan(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanApi#getPlan");
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

