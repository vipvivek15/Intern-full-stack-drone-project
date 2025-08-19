package org.example.skycartmodelsflight.jpa;

import org.example.skycartmodelsflight.models.PreFlightCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreFlightCheckRepository extends JpaRepository<PreFlightCheck, String> {
}
