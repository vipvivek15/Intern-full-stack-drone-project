import {
  FETCH_LOCATION_REQUEST,
  FETCH_LOCATION_SUCCESS,
  FETCH_LOCATION_FAILURE,
} from '../actions/locationActions';

const initialState = {
  loading: false,
  location: null,
  error: null,
};

const locationReducer = (state = initialState, action) => {
  switch (action.type) {
      case FETCH_LOCATION_REQUEST:
          return { ...state, loading: true, error: null };

      case FETCH_LOCATION_SUCCESS:
          return { ...state, loading: false, location: action.payload };

      case FETCH_LOCATION_FAILURE:
          return { ...state, loading: false, error: action.payload };

      default:
          return state;
  }
};

export default locationReducer;
