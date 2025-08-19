import { render, screen, fireEvent } from '@testing-library/react';
import LoginPage from '../components/LoginPage';

test('renders login form and handles login', () => {
  const mockLogin = jest.fn();
  render(<LoginPage onLogin={mockLogin} />);

  fireEvent.change(screen.getByLabelText(/Username:/i), { target: { value: 'pilot' } });
  fireEvent.change(screen.getByLabelText(/Password:/i), { target: { value: 'password' } });
  fireEvent.click(screen.getByText(/Login/i));

  expect(mockLogin).toHaveBeenCalledWith('pilot', 'password');
});