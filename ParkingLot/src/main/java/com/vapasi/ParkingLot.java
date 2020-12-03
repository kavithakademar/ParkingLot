package com.vapasi;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    static final  int INITIAL_CAPACITY = 2;
    static Map<Object, Car> parkingSlots = new HashMap<>(INITIAL_CAPACITY);

    public Object park(Car car) {
        if(parkingSlots.size() == INITIAL_CAPACITY) {
            throw new ParkingLotLimitIsOverException("The parking lot is full");
        }
        Object token = new Object();
        parkingSlots.put(token, car);
        return token;
    }

    public boolean isParked(Car car) {
        return parkingSlots.containsValue(car);
    }

    public Car unPark(Object token) {
        if(token == null) {
            throw new InvalidTokenException("Please enter valid exception");
        }
        Car car = parkingSlots.get(token);
        parkingSlots.remove(token);
        return car;
    }

}
