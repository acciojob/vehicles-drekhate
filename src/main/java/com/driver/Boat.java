package com.driver;

public class Boat implements WaterVehicle {
    public Boat() {
        super();
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
