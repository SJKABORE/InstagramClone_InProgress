package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fkBTVlf9K2eXFKuiaGN8hVbG3YBsS5mZ9E3BIkd8")
                .clientKey("scpN9eg0xV7KPkBxT6HfibAUMt6hwwTDEuQaeg9O")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
