package com.phonegap.asxtecnologia.startup;

import android.os.Bundle;
import org.apache.cordova.*;

public class StartUpActivity extends CordovaActivity 
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());       
        //super.loadUrl("file:///android_asset/www/index.html");
    }
}