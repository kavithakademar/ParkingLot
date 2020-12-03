package com.vapasi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    static ParkingLot parkingLot;
    static Car car;
    private static Object token;

    @BeforeAll
    public static void setup() {
        parkingLot = new ParkingLot();
    }

    @BeforeEach
    public void setupBeforeEachTest() {
        car = new Car();
    }


    @Test
    public void shouldUnParkMyCar() {
        token = parkingLot.park(car);
        Car unparkedCar = parkingLot.unPark(token);
        assertFalse(parkingLot.isParked(unparkedCar));
        assertEquals(car, unparkedCar);
    }


    @Test
    public void shouldThrowExceptionWhenUnParkUsedInvalidToken() {
        token = null;
        assertThrows(InvalidTokenException.class, () -> parkingLot.unPark(token));
    }


    @Test
    public void shouldThrowExceptionWhenTheParkingLotLimitIsOver() {
        token = parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));

        token = parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));

        assertThrows(ParkingLotLimitIsOverException.class, () -> parkingLot.park(car));
    }

    @Test
    public void shouldNotifyParkingLotOwnerThatParkingIsFull() {
        token = parkingLot.park(car);
        parkingLot.isParked(car);

        token = parkingLot.park(car);
        parkingLot.isParked(car);
        ParkingOwner parkingOwner = new ParkingOwner();
        assertTrue(parkingOwner.isParkingFull);
    }

    @AfterEach
    public void reset() {
        parkingLot.unPark(car);
    }
}
