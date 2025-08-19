package org.example.locationtracking.service;

import org.example.locationtracking.model.DroneLocation;
import org.example.locationtracking.repository.DroneLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneLocationService {

    @Autowired
    private DroneLocationRepository repository;

    public DroneLocation saveLocation(DroneLocation location) {
        location.setLastUpdated(System.currentTimeMillis());
        return repository.save(location);
    }

    public List<DroneLocation> getLocationsByDroneId(String droneId) {
        return repository.findByDroneId(droneId);
    }
}
