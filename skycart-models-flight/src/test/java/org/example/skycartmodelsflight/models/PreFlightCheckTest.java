package org.example.skycartmodelsflight.models;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PreFlightCheckTest {

    @Test
    void testPreFlightCheckGettersAndSetters() {
        PreFlightCheck check = new PreFlightCheck();
        check.setCheckId("CHK001");
        check.setFlightId("FL123");
        check.setType(PreFlightCheckType.FUEL_LEVEL);
        check.setStatus(true);
        check.setLastUpdated(LocalDateTime.of(2025, 1, 15, 9, 0));

        assertEquals("CHK001", check.getCheckId());
        assertEquals("FL123", check.getFlightId());
        assertEquals(PreFlightCheckType.FUEL_LEVEL, check.getType());
        assertTrue(check.isStatus());
        assertEquals(LocalDateTime.of(2025, 1, 15, 9, 0), check.getLastUpdated());
    }
}
