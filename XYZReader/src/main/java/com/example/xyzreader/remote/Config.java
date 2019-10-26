package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();
//    private static final String REMOTE_URL = "https://go.udacity.com/xyz-reader-json";
    private static final String REMOTE_URL = "https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json";

    static {
        URL url = null;
        try {
            url = new URL(REMOTE_URL);
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
