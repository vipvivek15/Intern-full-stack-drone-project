import React from 'react';
import { createRoot } from 'react-dom/client';
import { Provider } from 'react-redux';
import store from './state/redux/store';
import Dashboard from './components/Dashboard';
import './styles/Dashboard.scss';

const container = document.getElementById('root');
const root = createRoot(container);
root.render(
  <Provider store={store}>
    <Dashboard />
  </Provider>
);
