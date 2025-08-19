package org.example.skycartmodelsflight.models;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    @Test
    void testFlightGettersAndSetters() {
        Flight flight = new Flight();
        flight.setFlightId("FL123");
        flight.setDeparture("New York");
        flight.setDestination("San Francisco");
        flight.setScheduledTime(LocalDateTime.of(2025, 1, 15, 10, 30));
        flight.setStatus(FlightStatus.SCHEDULED);

        assertEquals("FL123", flight.getFlightId());
        assertEquals("New York", flight.getDeparture());
        assertEquals("San Francisco", flight.getDestination());
        assertEquals(LocalDateTime.of(2025, 1, 15, 10, 30), flight.getScheduledTime());
        assertEquals(FlightStatus.SCHEDULED, flight.getStatus());
    }
}

