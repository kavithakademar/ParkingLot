package com.vapasi;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<String> parkingSlots = new ArrayList<>();

    public void park(String car) {
        parkingSlots.add(car);
    }
    public boolean isParked(String car){
        return parkingSlots.contains(car);
    }

    public void unPark(String car) {
        parkingSlots.remove(car);
    }

    public boolean isUnParked(String car) {
        return !parkingSlots.contains(car);
    }
}
