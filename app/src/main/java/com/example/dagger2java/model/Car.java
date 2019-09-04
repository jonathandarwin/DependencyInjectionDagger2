package com.example.dagger2java.model;

import javax.inject.Inject;

public class Car {

    @Inject
    Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public String drive(){
        return engine.start() + " Driving...";
    }
}
