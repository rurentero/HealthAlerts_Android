# EventResource

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postEvent**](EventResource.md#postEvent) | **POST** /event | Sends an event


<a name="postEvent"></a>
# **postEvent**
> String postEvent(event)

Sends an event

Sends an event

### Example
```java
// Import classes:
//import org.openapitools.server.resource.EventResource;

EventResource apiInstance = new EventResource();
Event event = new Event(); // Event | Information about the event
try {
    String result = apiInstance.postEvent(event);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventResource#postEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event** | [**Event**](Event.md)| Information about the event |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

