package com.vapasi;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    static ParkingLot parkingLot;

    private static Object token;
    static Car car;

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
        assertThrows(InvalidTokenException.class , () -> parkingLot.unPark(token));
    }


    @Test
    @Order(4)
    public void shouldThrowExceptionWhenTheParkingLotLimitIsOver() {
        token = parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));

        token = parkingLot.park(car);
        assertTrue(parkingLot.isParked(car));

        assertThrows(ParkingLotLimitIsOverException.class , () -> parkingLot.park(car));
    }

    @AfterEach
    public void reset() {
        parkingLot.unPark(car);
    }
}
