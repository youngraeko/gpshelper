package com.swipeclock.twm.gpshelper;

import android.location.LocationManager;
import android.content.Context;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import org.json.JSONObject;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

/**
 * Created by YKO on 12/4/14.
 */
public class GPSHelper extends CordovaPlugin {

    LocationManager locationManager;

    public static final String ACTION_CHECK_GPS_ENABLED = "checkGPSEnabled";

    public GPSHelper() {
    }

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        this.locationManager = (LocationManager)cordova.getActivity().getSystemService(Context.LOCATION_SERVICE);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_CHECK_GPS_ENABLED.equals(action)) {

                String isGPSEnabled = "GPS Enabled";

                if (this.locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
                    isGPSEnabled = "GPS Enabled";
                }else{
                    isGPSEnabled = "GPS Disabled";
                }

                PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, isGPSEnabled);
                pluginResult.setKeepCallback(true);
                callbackContext.sendPluginResult(pluginResult);

                //callbackContext.success();
                return true;
            }
            callbackContext.error("Invalid action");
            return false;

        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        }
    }
}
