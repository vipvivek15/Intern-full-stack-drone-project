import React from 'react';
import '../styles/TaskDetails.scss';

function TaskDetails({ task }) {
  return (
    <div className="task-details">
      <h3>Task: {task.task}</h3>
      <p>Status: {task.completed ? 'Completed' : 'Pending'}</p>
    </div>
  );
}

export default TaskDetails;