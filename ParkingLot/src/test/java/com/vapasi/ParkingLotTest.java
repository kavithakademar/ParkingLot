package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    static ParkingLot parkingLot;
    static Car car = new Car("KA 1234");
    private static Object token;

    @BeforeAll
    public static void setup() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void shouldParkMyCarAndCheckIfItParkedOrNot() {
        token = parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));
    }

    @Test
    public void shouldUnParkMyCar() {
        token = parkingLot.park(car);
        Car unpackedCar = parkingLot.unPark(token);
        assertFalse(parkingLot.isParked(unpackedCar));
        assertEquals(car, unpackedCar);
    }

}
