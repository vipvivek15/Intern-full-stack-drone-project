package org.example.skycartmodelsflight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreFlightCheckTypeTest {

    @Test
    void testPreFlightCheckTypeValues() {
        PreFlightCheckType[] types = PreFlightCheckType.values();
        assertEquals(4, types.length);
        assertEquals(PreFlightCheckType.FUEL_LEVEL, types[0]);
        assertEquals(PreFlightCheckType.ENGINE_HEALTH, types[1]);
        assertEquals(PreFlightCheckType.PILOT_READY, types[2]);
        assertEquals(PreFlightCheckType.WEATHER_CLEARANCE, types[3]);
    }

    @Test
    void testPreFlightCheckTypeValueOf() {
        assertEquals(PreFlightCheckType.FUEL_LEVEL, PreFlightCheckType.valueOf("FUEL_LEVEL"));
        assertEquals(PreFlightCheckType.ENGINE_HEALTH, PreFlightCheckType.valueOf("ENGINE_HEALTH"));
        assertEquals(PreFlightCheckType.PILOT_READY, PreFlightCheckType.valueOf("PILOT_READY"));
        assertEquals(PreFlightCheckType.WEATHER_CLEARANCE, PreFlightCheckType.valueOf("WEATHER_CLEARANCE"));
    }
}
