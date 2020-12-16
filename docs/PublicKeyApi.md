# PublicKeyApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPublicKey**](PublicKeyApi.md#getPublicKey) | **GET** /public-key | Get public key

<a name="getPublicKey"></a>
# **getPublicKey**
> InlineResponse2001 getPublicKey(xApiKey)

Get public key

Get public key

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PublicKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PublicKeyApi apiInstance = new PublicKeyApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getPublicKey(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicKeyApi#getPublicKey");
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

