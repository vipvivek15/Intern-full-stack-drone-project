export const FETCH_LOCATION_REQUEST = 'FETCH_LOCATION_REQUEST';
export const FETCH_LOCATION_SUCCESS = 'FETCH_LOCATION_SUCCESS';
export const FETCH_LOCATION_FAILURE = 'FETCH_LOCATION_FAILURE';

export const fetchDroneLocation = () => {
    return async (dispatch) => {
        dispatch({ type: FETCH_LOCATION_REQUEST });
        try {
            const response = await new Promise((resolve) =>
                setTimeout(() => resolve({ latitude: 37.7749, longitude: -122.4194 }), 1000)
            );

            dispatch({
                type: FETCH_LOCATION_SUCCESS,
                payload: response,
            });
        } catch (error) {
            dispatch({
                type: FETCH_LOCATION_FAILURE,
                payload: error.message,
            });
        }
    };
};
