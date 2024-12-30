package com.amazingcode.in.example.factory;

public class FourWheelerFactory implements  VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
