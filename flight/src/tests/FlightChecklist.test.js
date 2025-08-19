import { render, screen, fireEvent } from '@testing-library/react';
import { Provider } from 'react-redux';
import store from '../state/redux/store';
import FlightChecklist from '../components/FlightChecklist';

test('renders flight checklist', () => {
  render(
    <Provider store={store}>
      <FlightChecklist />
    </Provider>
  );
  expect(screen.getByText(/Check fuel levels/i)).toBeInTheDocument();
});

test('toggles task status', () => {
  render(
    <Provider store={store}>
      <FlightChecklist />
    </Provider>
  );
  const checkbox = screen.getByLabelText(/Check fuel levels/i);
  fireEvent.click(checkbox);
  expect(checkbox.checked).toBe(true);
});