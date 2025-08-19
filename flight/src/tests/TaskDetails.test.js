import { render, screen } from '@testing-library/react';
import TaskDetails from '../components/TaskDetails';

test('renders task details correctly', () => {
  const mockTask = { task: 'Inspect engines', completed: false };
  render(<TaskDetails task={mockTask} />);
  expect(screen.getByText(/Inspect engines/i)).toBeInTheDocument();
  expect(screen.getByText(/Pending/i)).toBeInTheDocument();
});