# PayoutApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayout**](PayoutApi.md#getPayout) | **GET** /payout | Get payout

<a name="getPayout"></a>
# **getPayout**
> InlineResponse2001 getPayout(xApiKey)

Get payout

Get payout

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PayoutApi;


PayoutApi apiInstance = new PayoutApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getPayout(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutApi#getPayout");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

