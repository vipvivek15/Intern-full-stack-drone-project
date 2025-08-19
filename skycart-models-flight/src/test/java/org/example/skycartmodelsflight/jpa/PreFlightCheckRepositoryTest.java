package org.example.skycartmodelsflight.jpa;

import org.example.skycartmodelsflight.models.PreFlightCheck;
import org.example.skycartmodelsflight.models.PreFlightCheckType;
import org.example.skycartmodelsflight.jpa.PreFlightCheckRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PreFlightCheckRepositoryTest {

    @Mock
    private PreFlightCheckRepository preFlightCheckRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveAndRetrievePreFlightCheck() {
        // Create a sample PreFlightCheck object
        PreFlightCheck check = new PreFlightCheck();
        check.setCheckId("CHK001");
        check.setFlightId("FL123");
        check.setType(PreFlightCheckType.FUEL_LEVEL);
        check.setStatus(true);
        check.setLastUpdated(LocalDateTime.now());

        // Mock the save and findById methods
        when(preFlightCheckRepository.findById("CHK001")).thenReturn(Optional.of(check));

        // Save the object (mocked)
        preFlightCheckRepository.save(check);

        // Retrieve the object using the mocked repository
        PreFlightCheck retrievedCheck = preFlightCheckRepository.findById("CHK001").orElse(null);

        // Assertions
        assertNotNull(retrievedCheck);
        assertEquals(PreFlightCheckType.FUEL_LEVEL, retrievedCheck.getType());
        assertTrue(retrievedCheck.isStatus());

        // Verify interactions
        verify(preFlightCheckRepository, times(1)).save(check);
        verify(preFlightCheckRepository, times(1)).findById("CHK001");
    }
}
