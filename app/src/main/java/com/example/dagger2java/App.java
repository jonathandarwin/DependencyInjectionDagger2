package com.example.dagger2java;

import android.app.Application;

import com.example.dagger2java.di.AppComponent;
import com.example.dagger2java.di.AppModule;
import com.example.dagger2java.di.DaggerAppComponent;


public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
