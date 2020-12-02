package com.vapasi;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<String> parkingSlots = new ArrayList<>();

    public boolean park(String car) {
        return parkingSlots.add(car);
    }
}
