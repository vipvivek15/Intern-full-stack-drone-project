package org.example.skycartmodelsflight.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "preflight_checks") // Table name
public class PreFlightCheck {
    @Id
    private String checkId;

    private String flightId;
    private PreFlightCheckType type;
    private boolean status;
    private LocalDateTime lastUpdated;

    // Getters and Setters
    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public PreFlightCheckType getType() {
        return type;
    }

    public void setType(PreFlightCheckType type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
