package com.example.dagger2java.di;

import com.example.dagger2java.app.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {
    void inject(MainActivity target);
}

