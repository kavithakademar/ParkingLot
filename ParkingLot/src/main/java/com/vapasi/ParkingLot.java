package com.vapasi;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    static Map<Object, Car> parkingSlots = new HashMap<>();

    public Object park(Car car) {
        Object token = new Object();
        parkingSlots.put(token, car);
        return token;
    }

    public boolean isParked(Car car) {
        return parkingSlots.containsValue(car);
    }

    public Car unPark(Object token) {
        Car car = parkingSlots.get(token);
        parkingSlots.remove(token);
        return car;
    }

}
