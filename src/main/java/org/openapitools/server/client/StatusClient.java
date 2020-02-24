package org.openapitools.server.client;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import org.eclipse.paho.android.service.MqttService;
import org.json.JSONException;
import org.json.JSONObject;
import org.openapitools.server.service.MQTTService;

public class StatusClient {
    private Context context;
    private MQTTService mqttService;

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
