package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wvEuNHFcPmHTGv4uAPpA2YF5zO69I7GQ3MRvNJ2D")
                .clientKey("oKMeXDj5pCrYlx3NlK0TjwxTRW3m5SuTOuYl29hV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
