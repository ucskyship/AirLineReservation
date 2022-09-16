package data.models;

import services.BookingRegistration;

public class EconomyClass extends BookingRegistration {

    @Override
    public String assignSeat(String name, String phoneNumber) {
        for (int i = 5; i < getSeats().length; i++) {
            if (getSeats()[i] == null) {
                getSeats()[i] = new Passenger(name, phoneNumber);
                return "Status: Economy-class Booked successfully!\n" + "Your seat number is: " + (i + 1);
            }
        }
        return "full";
    }
}
