# openapi-android-server

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-server</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-server:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/openapi-android-server-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.server.resource.EventResource;

public class EventResourceExample {

    public static void main(String[] args) {
        EventResource apiInstance = new EventResource();
        Event event = new Event(); // Event | Information about the event
        try {
            String result = apiInstance.postEvent(event);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventResource#postEvent");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventResource* | [**postEvent**](docs/EventResource.md#postEvent) | **POST** /event | Sends an event
*StatusResource* | [**getTemperature**](docs/StatusResource.md#getTemperature) | **GET** /temperature | Gets the user temperature
*StatusResource* | [**getUser**](docs/StatusResource.md#getUser) | **GET** /user | Gets user information
*EventResponse* | [**postEvent**](docs/EventResponse.md#postEvent) | **POST** /event | Sends an event
*StatusResponse* | [**getTemperature**](docs/StatusResponse.md#getTemperature) | **GET** /temperature | Gets the user temperature
*StatusResponse* | [**getUser**](docs/StatusResponse.md#getUser) | **GET** /user | Gets user information


## Documentation for Models

 - [Event](docs/Event.md)
 - [Location](docs/Location.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@spilab.es

