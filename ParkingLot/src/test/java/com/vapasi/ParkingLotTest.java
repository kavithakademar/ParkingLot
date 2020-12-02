package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    static ParkingLot parkingLot;
    static Car car = new Car("KA 1234");
    private static int tokenNum;

    @BeforeAll
    public static void setup() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void shouldParkMyCarAndCheckIfItParkedOrNot() {
        tokenNum = parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));
    }

    @Test
    public void shouldUnParkMyCar() {
        tokenNum = parkingLot.park(car);
        Car unparkedCar = parkingLot.unPark(tokenNum);
        assertTrue(parkingLot.isUnParked(tokenNum));
        assertEquals(car, unparkedCar);
    }



}
