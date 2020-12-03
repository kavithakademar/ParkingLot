package com.vapasi;

public class ParkingOwner {
    boolean isParkingFull = true;

    public void notifyTheParkingIsFull(boolean isParkingFull) {
        this.isParkingFull = isParkingFull;
    }

    public void notifyTheParkingIsEmpty(boolean isParkingFull) {
        this.isParkingFull = isParkingFull;
    }
}