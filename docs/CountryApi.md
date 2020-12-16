# CountryApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountry**](CountryApi.md#getCountry) | **GET** /country | Get country

<a name="getCountry"></a>
# **getCountry**
> InlineResponse2001 getCountry(xApiKey)

Get country

Get country

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CountryApi;


CountryApi apiInstance = new CountryApi();
String xApiKey = "xApiKey_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getCountry(xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryApi#getCountry");
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

