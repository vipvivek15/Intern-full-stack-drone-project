import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchDroneLocation } from '../state/redux/actions/locationActions';
import '../styles/DroneLocation.scss';

const DroneLocation = () => {
    const dispatch = useDispatch();
    const { loading, location, error } = useSelector((state) => state.location);


    useEffect(() => {
        dispatch(fetchDroneLocation());
    }, [dispatch]);

    if (loading) {
        return <p>Loading drone location...</p>;
    }

    if (error) {
        return <p>Error: {error}</p>;
    }

    if (location) {
        return (
            <div className="drone-location">
                <h1>Drone Location</h1>
                <p>Latitude: {location.latitude}</p>
                <p>Longitude: {location.longitude}</p>
            </div>
        );
    }

    return null;
};

export default DroneLocation;
