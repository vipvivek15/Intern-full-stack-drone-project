import React from 'react';
import FlightChecklist from './FlightChecklist';
import UserProfile from './UserProfile';
import '../styles/Dashboard.scss';

function Dashboard() {
  return (
    <div className="dashboard-container">
      <UserProfile />
      <h1>Flight Preparation Dashboard</h1>
      <FlightChecklist />
    </div>
  );
}

export default Dashboard;