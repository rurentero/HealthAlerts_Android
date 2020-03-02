package org.openapitools.server.client;

import android.content.Context;
import android.content.Intent;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import org.json.JSONException;
import org.json.JSONObject;

public class StatusClient {
    private Context context;

    public StatusClient(Context context) {
        this.context = context;


    }

    public void executeMethod(JSONObject data){

        if (data.has("id")&&data.has("details")){
            getUser(data);
        } else {
            getTemperature(data);
        }


    }

    private void getBodyTemperature(JSONObject data) {
        //Change state on MainActivity TextView
        try {
            String temp = data.get("temperature").toString();
            Intent intentDevice = new Intent();
            intentDevice.putExtra("clientMessage", temp);
            intentDevice.setAction("CLIENTNOTIFICATION");
            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intentDevice);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void getTemperature(JSONObject data) {
        //Change state on MainActivity TextView
        try {
            String temp = data.get("temperature").toString();
            Intent intentDevice = new Intent();
            intentDevice.putExtra("clientMessage", temp);
            intentDevice.setAction("CLIENTNOTIFICATION");
            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intentDevice);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void getUser(JSONObject data) {
        //Change state on MainActivity TextView
        try {
            String id = data.getString("id");
            String details = data.getString("details");

            Intent intentDevice = new Intent();
            intentDevice.putExtra("clientMessage", "ID: "+id+". Details: "+details);
            intentDevice.setAction("CLIENTNOTIFICATION");
            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intentDevice);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
