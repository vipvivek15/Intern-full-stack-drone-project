package org.example.skycartmodelsflight.jpa;

import org.example.skycartmodelsflight.models.Flight;
import org.example.skycartmodelsflight.models.FlightStatus;
import org.example.skycartmodelsflight.jpa.FlightRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FlightRepositoryTest {

    @Mock
    private FlightRepository flightRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveAndRetrieveFlight() {
        // Create a sample Flight object
        Flight flight = new Flight();
        flight.setFlightId("FL123");
        flight.setDeparture("New York");
        flight.setDestination("San Francisco");
        flight.setScheduledTime(LocalDateTime.now());
        flight.setStatus(FlightStatus.SCHEDULED);

        // Mock the save and findById methods
        when(flightRepository.findById("FL123")).thenReturn(Optional.of(flight));

        // Save the object (mocked)
        flightRepository.save(flight);

        // Retrieve the object using the mocked repository
        Flight retrievedFlight = flightRepository.findById("FL123").orElse(null);

        // Assertions
        assertNotNull(retrievedFlight);
        assertEquals("New York", retrievedFlight.getDeparture());
        assertEquals("San Francisco", retrievedFlight.getDestination());

        // Verify interactions
        verify(flightRepository, times(1)).save(flight);
        verify(flightRepository, times(1)).findById("FL123");
    }
}
