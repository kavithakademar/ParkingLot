package com.vapasi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParkingLot {
    static Map<Integer, Car> parkingSlots = new HashMap<>();
    private static int token = 0;

    public int park(Car car) {
        token ++;
        parkingSlots.put(token, car);
        return token;
    }

    public boolean isParked(int tokenNum) {
        return parkingSlots.get(tokenNum) != null;
    }

    public Car unPark(int tokenNum) {
        Car car = parkingSlots.get(tokenNum);
        parkingSlots.remove(tokenNum);
        return car;
    }

    public boolean isUnParked(Car car) {
        return !parkingSlots.containsValue(car);
    }
}
