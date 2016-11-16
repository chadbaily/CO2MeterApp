package com.example.chadb.co2meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;


        if(height > 1920 && width > 1080) {

            String temp = "<iframe width=\" " + width / 4.75 + " \" height=\"" + height / 16.25 + "\" style=\"border: 1px solid #cccccc;\"" +
                    "src=\"http://api.thingspeak.com/channels/183510/charts/1?width=" + width / 4.75 + "&height=" + height / 16.25 + "&results=30&dynamic=true\"" +
                    " ></iframe>";

            String humidity = "<iframe width=\" " + width / 4.75 + " \" height=\"" + height / 16.25 + "\" style=\"border: 1px solid #cccccc;\"" +
                    "src=\"http://api.thingspeak.com/channels/183510/charts/2?width=" + width / 4.75 + "&height=" + height / 16.25 + "&results=30&dynamic=true\"" +
                    " ></iframe>";

            String co2 = "<iframe width=\" " + width / 4.75 + " \" height=\"" + height / 16.25 + "\" style=\"border: 1px solid #cccccc;\"" +
                    "src=\"http://api.thingspeak.com/channels/183510/charts/3?width=" + width / 4.75 + "&height=" + height / 16.25 + "&results=30&dynamic=true\"" +
                    " ></iframe>";

            WebView tempView;
            tempView = (WebView) findViewById(R.id.temp);
            tempView.getSettings().setJavaScriptEnabled(true);
            tempView.loadData(temp, "text/html", null);


            WebView humidityView;
            humidityView = (WebView) findViewById(R.id.humidity);
            humidityView.getSettings().setJavaScriptEnabled(true);
            humidityView.loadData(humidity, "text/html", null);

            WebView co2View;
            co2View = (WebView) findViewById(R.id.co2);
            co2View.getSettings().setJavaScriptEnabled(true);
            co2View.loadData(co2, "text/html", null);
        }

        else
        {
            String temp = "<iframe frameborder=\"0\" scrolling=\"no\" style=\"overflow: hidden\" width=\" " + width / 3.5 + " \" height=\"" + height / 12.5 + "\" style=\"border: 1px solid #cccccc;\"" +
                    "src=\"http://api.thingspeak.com/channels/183510/charts/1?width=" + width / 3.15 + "&height=" + height / 10 + "&results=30&dynamic=true\"" +
                    "  ></iframe>";

            String humidity = "<iframe frameborder=\"0\" scrolling=\"no\" style=\"overflow: hidden\" width=\" " + width / 3.5 + " \" height=\"" + height / 12.5 + "\" style=\"border: 1px solid #cccccc;\"" +
                    "src=\"http://api.thingspeak.com/channels/183510/charts/2?width=" + width / 3.15 + "&height=" + height / 10 + "&results=30&dynamic=true\"" +
                    " ></iframe>";

            String co2 = "<iframe frameborder=\"0\" scrolling=\"no\" style=\"overflow: hidden\" width=\" " + width / 3.5 + " \" height=\"" + height / 12.5 + "\" style=\"border: 1px solid #cccccc;\"" +
                    "src=\"http://api.thingspeak.com/channels/183510/charts/3?width=" + width / 3.15 + "&height=" + height / 10 + "&results=30&dynamic=true\"" +
                    "> </iframe>";

            WebView tempView;
            tempView = (WebView) findViewById(R.id.temp);
            tempView.getSettings().setJavaScriptEnabled(true);
            tempView.loadData(temp, "text/html", null);


            WebView humidityView;
            humidityView = (WebView) findViewById(R.id.humidity);
            humidityView.getSettings().setJavaScriptEnabled(true);
            humidityView.loadData(humidity, "text/html", null);

            WebView co2View;
            co2View = (WebView) findViewById(R.id.co2);
            co2View.getSettings().setJavaScriptEnabled(true);
            co2View.loadData(co2, "text/html", null);
        }



    }
}
