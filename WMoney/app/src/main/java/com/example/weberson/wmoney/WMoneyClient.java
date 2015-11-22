package com.example.weberson.wmoney;

import android.os.AsyncTask;

import java.net.HttpURLConnection;
import java.net.URL;

public class WMoneyClient extends AsyncTask<String, Void, Boolean> {

    @Override
    protected Boolean doInBackground(String... params) {
        try{
            URL url = new URL(String.format("http://hmg-wmoney.azurewebsites.net/api/Users?email=%s&password=%s", "weberson1990ms@gmail.com", "1234"));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int response = conn.getResponseCode();

            if (response == 200){
                return true;
            }
        }
        catch (Exception e) {
            // writing exception to log
            e.printStackTrace();
        }

        return false;
    }
}
