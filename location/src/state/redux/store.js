import { createStore, combineReducers, applyMiddleware } from 'redux';
import { thunk } from 'redux-thunk';
import locationReducer from './reducers/locationReducer';

const rootReducer = combineReducers({
    location: locationReducer, // Updated key to match component usage
});

const store = createStore(rootReducer, applyMiddleware(thunk));

export default store;
