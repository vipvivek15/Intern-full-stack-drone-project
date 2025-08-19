const initialState = [
    { id: 1, task: 'Check fuel levels', completed: false },
    { id: 2, task: 'Inspect engines', completed: false },
    { id: 3, task: 'Verify navigation system', completed: false },
    { id: 4, task: 'Confirm weather conditions', completed: false },
  ];
  
  const flightReducer = (state = initialState, action) => {
    switch (action.type) {
      case 'TOGGLE_TASK':
        return state.map((task) =>
          task.id === action.payload
            ? { ...task, completed: !task.completed }
            : task
        );
      default:
        return state;
    }
  };
  
  export default flightReducer;