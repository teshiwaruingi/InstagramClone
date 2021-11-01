package com.codepath.twaruingi.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YosR3m7FKfK4mkCdEyCCIItzOCPLje774XRzx61u")
                .clientKey("1cRO2qHaVcKCeEVcNDFS1oKfqvD1NkOsBTqQkGKC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
