import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import '../styles/FlightChecklist.scss';

function FlightChecklist() {
  const flightChecklist = useSelector((state) => state.flightChecklist);
  const dispatch = useDispatch();

  const handleToggle = (taskId) => {
    dispatch({ type: 'TOGGLE_TASK', payload: taskId });
  };

  return (
    <div className="checklist-container">
      <h2>Flight Preparation Checklist</h2>
      <ul>
        {flightChecklist.map((task) => (
          <li key={task.id}>
            <label>
              <input
                type="checkbox"
                checked={task.completed}
                onChange={() => handleToggle(task.id)}
              />
              {task.task}
            </label>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlightChecklist;