package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParkingLotTest {
    ParkingLot parkingLot;

    @BeforeAll
    public void setup() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void shouldParkMyCar()   {
        assertTrue(parkingLot.park("Car"));
    }
}
