package services;

import data.models.Passenger;

public abstract class BookingRegistration {
    static Passenger[] seats = new Passenger[10];

    public static Passenger[] getSeats() {
        return seats;
    }

    public abstract String assignSeat(String name, String phoneNumber);
}
