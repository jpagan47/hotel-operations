package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public double getReservationTotal(){
        double totalPrice = getPrice();
        if(isWeekend)
            totalPrice *= 1.10;
        return totalPrice;
    }
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }


    public double getPrice(){
        double price = 0;
        if(roomType.equalsIgnoreCase("king")){
            price =139.00;
        } else if (roomType.equalsIgnoreCase("")){
            price = 124.00;

        }

        return price;
    }



}
