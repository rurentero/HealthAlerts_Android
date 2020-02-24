# StatusResource

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTemperature**](StatusResource.md#getTemperature) | **GET** /temperature | Gets the user temperature
[**getUser**](StatusResource.md#getUser) | **GET** /user | Gets user information


<a name="getTemperature"></a>
# **getTemperature**
> Double getTemperature()

Gets the user temperature

Obtain current user temperature

### Example
```java
// Import classes:
//import org.openapitools.server.resource.StatusResource;

StatusResource apiInstance = new StatusResource();
try {
    Double result = apiInstance.getTemperature();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusResource#getTemperature");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Double**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getUser"></a>
# **getUser**
> User getUser()

Gets user information

Obtain user general information

### Example
```java
// Import classes:
//import org.openapitools.server.resource.StatusResource;

StatusResource apiInstance = new StatusResource();
try {
    User result = apiInstance.getUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusResource#getUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

