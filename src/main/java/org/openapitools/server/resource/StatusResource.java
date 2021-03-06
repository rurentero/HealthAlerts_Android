/**
 * Health Alerts
 * This application allows users to send and receive information about a user's health condition.
 *
 * OpenAPI spec version: 1.0
 * Contact: info@spilab.es
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.resource;


import org.openapitools.server.model.*;
import org.openapitools.server.response.*;

import java.util.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import org.openapitools.server.model.User;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import android.util.Log;
import android.widget.Toast;


public class StatusResource {

    private Context context;
    private RequestQueue request;

    private StatusResponse statusResponse;

    public StatusResource(Context context) {
        this.context = context;
        request = Volley.newRequestQueue(context);

    }

  public void executeMethod(StatusResponse response){

        statusResponse=response;

      switch (response.getMethod()){
          case "getTemperature":
            getTemperature();
            break;
          case "getUser":
            getUser();
            break;
      }


  }

  /**
  * Gets the user temperature
  * Obtain current user temperature
   * @return Double
  */
  public Double getTemperature (){

    //TODO: Android side wont implement this method.
      return null;
  }
  /**
  * Gets user information
  * Obtain user general information
   * @return User
  */
  public User getUser (){

  //TODO: Android side wont implement this method.

      return null;
  }


}
