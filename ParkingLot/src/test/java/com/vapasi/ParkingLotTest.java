package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParkingLotTest {
    static ParkingLot parkingLot;

    @BeforeAll
    public static void setup() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void shouldParkMyCar()   {
        assertTrue(parkingLot.park("KA8051"));
    }
}
