package data.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EconomyClassTest {
    EconomyClass economyClass;
    Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger("me", "08133856783");
        economyClass = new EconomyClass();
    }

    @Test
    void testThatSeatCanBeBooked() {

    }
}