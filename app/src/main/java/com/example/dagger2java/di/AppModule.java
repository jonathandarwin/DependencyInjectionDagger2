package com.example.dagger2java.di;

import android.app.Application;
import android.content.Context;

import com.example.dagger2java.model.Car;
import com.example.dagger2java.model.Engine;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    public Engine provideEngine(){
        return new Engine();
    }

    @Provides
    @Singleton
    public Car provideCar(Engine engine){
        return new Car(engine);
    }
}
