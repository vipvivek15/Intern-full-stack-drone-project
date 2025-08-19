package org.example.locationtracking.controller;


import org.example.locationtracking.model.DroneLocation;
import org.example.locationtracking.service.DroneLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class DroneLocationController {

    @Autowired
    private DroneLocationService service;

    @PostMapping
    public ResponseEntity<DroneLocation> saveLocation(@RequestBody DroneLocation location) {
        DroneLocation savedLocation = service.saveLocation(location);
        return ResponseEntity.ok(savedLocation);
    }

    @GetMapping("/{droneId}")
    public ResponseEntity<List<DroneLocation>> getLocations(@PathVariable String droneId) {
        List<DroneLocation> locations = service.getLocationsByDroneId(droneId);
        return ResponseEntity.ok(locations);
    }
}
