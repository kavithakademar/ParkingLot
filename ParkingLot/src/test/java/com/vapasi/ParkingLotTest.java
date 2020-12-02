package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    static ParkingLot parkingLot;
    String car = "Jaguar";

    @BeforeAll
    public static void setup() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void shouldParkMyCarAndCheckIfItParkedOrNot()   {
        parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));
    }

    @Test
    public void shouldUnParkMyCar()   {
        parkingLot.unPark(car);
        assertTrue(parkingLot.isUnParked(car));
    }

}
