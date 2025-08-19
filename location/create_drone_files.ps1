# Root directory for the project
$rootDir = "src"
$publicDir = "public"

# Create directories
Write-Host "Creating directories..."
New-Item -ItemType Directory -Force -Path "$rootDir\components", "$rootDir\state\redux\actions", "$rootDir\state\redux\reducers", "$rootDir\styles", "$rootDir\tests", "$rootDir\utils", $publicDir

# Create DroneLocation.js
Write-Host "Creating DroneLocation.js..."
@"
import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchDroneLocation } from '../state/redux/actions/locationActions';
import './DroneLocation.scss';

const DroneLocation = () => {
  const dispatch = useDispatch();
  const { latitude, longitude } = useSelector((state) => state.location);

  useEffect(() => {
    dispatch(fetchDroneLocation());
  }, [dispatch]);

  return (
    <div className="drone-location">
      <h1>Drone Location</h1>
      {latitude && longitude ? (
        <p>
          Latitude: {latitude}, Longitude: {longitude}
        </p>
      ) : (
        <p>Loading location...</p>
      )}
    </div>
  );
};

export default DroneLocation;
"@ | Out-File -Encoding UTF8 "$rootDir\components\DroneLocation.js"

# Create locationActions.js
Write-Host "Creating locationActions.js..."
@"
export const FETCH_LOCATION_SUCCESS = 'FETCH_LOCATION_SUCCESS';

export const fetchDroneLocation = () => {
  return async (dispatch) => {
    try {
      const response = await new Promise((resolve) =>
        setTimeout(() => resolve({ latitude: 37.7749, longitude: -122.4194 }), 1000)
      );

      dispatch({
        type: FETCH_LOCATION_SUCCESS,
        payload: response,
      });
    } catch (error) {
      console.error('Error fetching location:', error);
    }
  };
};
"@ | Out-File -Encoding UTF8 "$rootDir\state\redux\actions\locationActions.js"

# Create locationReducer.js
Write-Host "Creating locationReducer.js..."
@"
import { FETCH_LOCATION_SUCCESS } from '../actions/locationActions';

const initialState = {
  latitude: null,
  longitude: null,
};

const locationReducer = (state = initialState, action) => {
  switch (action.type) {
    case FETCH_LOCATION_SUCCESS:
      return {
        ...state,
        latitude: action.payload.latitude,
        longitude: action.payload.longitude,
      };
    default:
      return state;
  }
};

export default locationReducer;
"@ | Out-File -Encoding UTF8 "$rootDir\state\redux\reducers\locationReducer.js"

# Create store.js
Write-Host "Creating store.js..."
@"
import { createStore, combineReducers, applyMiddleware } from 'redux';
import thunk from 'redux-thunk';
import locationReducer from './reducers/locationReducer';

const rootReducer = combineReducers({
  location: locationReducer,
});

const store = createStore(rootReducer, applyMiddleware(thunk));

export default store;
"@ | Out-File -Encoding UTF8 "$rootDir\state\redux\store.js"

# Create DroneLocation.scss
Write-Host "Creating DroneLocation.scss..."
@"
.drone-location {
  text-align: center;
  margin-top: 20px;

  h1 {
    font-size: 24px;
    margin-bottom: 10px;
  }

  p {
    font-size: 18px;
    color: #555;
  }
}
"@ | Out-File -Encoding UTF8 "$rootDir\styles\DroneLocation.scss"

# Create DroneLocation.test.js
Write-Host "Creating DroneLocation.test.js..."
@"
import React from 'react';
import { render } from '@testing-library/react';
import { Provider } from 'react-redux';
import configureStore from 'redux-mock-store';
import DroneLocation from '../components/DroneLocation';

const mockStore = configureStore([]);

test('renders loading message initially', () => {
  const store = mockStore({
    location: { latitude: null, longitude: null },
  });

  const { getByText } = render(
    <Provider store={store}>
      <DroneLocation />
    </Provider>
  );

  expect(getByText(/loading location.../i)).toBeInTheDocument();
});

test('renders location data when available', () => {
  const store = mockStore({
    location: { latitude: 37.7749, longitude: -122.4194 },
  });

  const { getByText } = render(
    <Provider store={store}>
      <DroneLocation />
    </Provider>
  );

  expect(getByText(/latitude: 37.7749/i)).toBeInTheDocument();
  expect(getByText(/longitude: -122.4194/i)).toBeInTheDocument();
});
"@ | Out-File -Encoding UTF8 "$rootDir\tests\DroneLocation.test.js"

# Create api.js
Write-Host "Creating api.js..."
@"
export const fetchLocationData = async () => {
  return new Promise((resolve) =>
    setTimeout(() => resolve({ latitude: 37.7749, longitude: -122.4194 }), 1000)
  );
};
"@ | Out-File -Encoding UTF8 "$rootDir\utils\api.js"

# Create index.html
Write-Host "Creating index.html..."
@"
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Drone Location</title>
</head>
<body>
  <div id="root"></div>
</body>
</html>
"@ | Out-File -Encoding UTF8 "$publicDir\index.html"

Write-Host "All files and directories created successfully!"
