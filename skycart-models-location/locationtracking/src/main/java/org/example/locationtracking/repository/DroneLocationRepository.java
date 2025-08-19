package org.example.locationtracking.repository;

import org.example.locationtracking.model.DroneLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DroneLocationRepository extends JpaRepository<DroneLocation, UUID> {
    List<DroneLocation> findByDroneId(String droneId);
}
