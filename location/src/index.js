import React from 'react';
import ReactDOM from 'react-dom/client'; // Use 'react-dom/client' for React 18
import { Provider } from 'react-redux';
import store from './state/redux/store';
import App from './App';

// Get the root element from your HTML
const rootElement = document.getElementById('root');

// Create the root and render the application
const root = ReactDOM.createRoot(rootElement);
root.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
);
