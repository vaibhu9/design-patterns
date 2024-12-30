package com.amazingcode.in.example.singleton;

public class EagerInitialization {

    public static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
