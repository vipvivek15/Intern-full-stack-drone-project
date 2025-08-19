package org.example.skycartmodelsflight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightStatusTest {

    @Test
    void testFlightStatusValues() {
        FlightStatus[] statuses = FlightStatus.values();
        assertEquals(4, statuses.length);
        assertEquals(FlightStatus.SCHEDULED, statuses[0]);
        assertEquals(FlightStatus.IN_PROGRESS, statuses[1]);
        assertEquals(FlightStatus.COMPLETED, statuses[2]);
        assertEquals(FlightStatus.CANCELLED, statuses[3]);
    }

    @Test
    void testFlightStatusValueOf() {
        assertEquals(FlightStatus.SCHEDULED, FlightStatus.valueOf("SCHEDULED"));
        assertEquals(FlightStatus.IN_PROGRESS, FlightStatus.valueOf("IN_PROGRESS"));
        assertEquals(FlightStatus.COMPLETED, FlightStatus.valueOf("COMPLETED"));
        assertEquals(FlightStatus.CANCELLED, FlightStatus.valueOf("CANCELLED"));
    }
}
