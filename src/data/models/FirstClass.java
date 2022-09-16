package data.models;

import services.BookingRegistration;

public class FirstClass extends BookingRegistration {

    @Override
    public String assignSeat(String name, String phoneNumber) {
        for (int i = 0; i < getSeats().length / 2; i++) {
            if (getSeats()[i] == null) {
                getSeats()[i] = new Passenger(name, phoneNumber);
                return "Status: First-class Booked successfully!\n" + "Your seat number is: " + (i + 1);
            }
        }
        return "no available seat";
    }
}
