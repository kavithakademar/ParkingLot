package com.vapasi;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {
    Set<Car> parkingSlots = new HashSet<>();


    public void park(Car car) {
        parkingSlots.add(car);
    }

    public boolean isParked(Car car) {
        return parkingSlots.contains(car);
    }

    public void unPark(Car car) {
        parkingSlots.remove(car);
    }

    public boolean isUnParked(Car car) {
        return !parkingSlots.contains(car);
    }
}
