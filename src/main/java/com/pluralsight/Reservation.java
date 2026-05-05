package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;


    public double getPrice(){
        double price = 0;
        if(roomType.equalsIgnoreCase("king")){
            price =139.00;
        } else if (roomType.equalsIgnoreCase("")){
            price = 124.00;

        }
        if(isWeekend)
            price *= 1.10;

        return price;
    }

    getRoomType();
    setRoomType(String roomType);
    getPrice();
    getNumberOfNights();
    setNumberOfNights(int numberOfNights);
    isWeekend();
}
