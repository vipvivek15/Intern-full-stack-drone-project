package org.example.skycartmodelsflight.jpa;

import org.example.skycartmodelsflight.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
}
