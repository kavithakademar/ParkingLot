package com.vapasi;

public class ParkingLotLimitIsOverException  extends RuntimeException{

    public ParkingLotLimitIsOverException (String msg) {
        super(msg);
    }

}
