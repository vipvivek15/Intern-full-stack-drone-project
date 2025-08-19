export const fetchTaskDetails = async (taskId) => {
  // Simulated API call
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve({ task: `Task ${taskId}`, status: 'Pending' });
    }, 1000);
  });
};
