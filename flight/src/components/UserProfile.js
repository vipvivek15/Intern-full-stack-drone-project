import React from 'react';
import { useSelector } from 'react-redux';
import '../styles/UserProfile.scss';

function UserProfile() {
  const { username } = useSelector((state) => state.user);
  return (
    <div className="user-profile">
      <h2>Welcome, {username}</h2>
    </div>
  );
}

export default UserProfile;
