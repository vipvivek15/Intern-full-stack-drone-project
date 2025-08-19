import { configureStore } from '@reduxjs/toolkit';
import userReducer from '../reducers/userReducer';
import flightReducer from '../reducers/flightReducer';

const store = configureStore({
  reducer: {
    user: userReducer,
    flightChecklist: flightReducer,
  },
});

export default store;
