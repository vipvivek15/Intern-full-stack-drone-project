# Flight Preparation App

A comprehensive and user-friendly web application designed to assist with flight preparation and pre-flight checks.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Available Scripts](#available-scripts)
- [Testing](#testing)

## Features

- User authentication with login functionality.
- Dashboard displaying user profile and flight checklist.
- Interactive flight checklist with task status management.
- Detailed view for individual tasks.
- State management using Redux.

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/skycart-inc/skycart-web-frontend
   cd  skycart-web-frontend/tree/master/src/main/js/model/flight
   ```
Install dependencies:
```bash
Node.js
```
Ensure you have Node.js installed, then run:

```bash
npm install
```
Usage
Start the development server:

```bash
npm start
```
This will run the app in development mode. Open http://localhost:3000 to view it in the browser.

Build for production:

```bash
npm run build
```
This will create an optimized production build in the build directory.

Project Structure
The project follows a structured directory layout:

```bash
src/
├── components/        # React components
│   ├── Dashboard.js
│   ├── FlightChecklist.js
│   ├── LoginPage.js
│   ├── TaskDetails.js
│   └── UserProfile.js
├── state/             # Redux state management
│   ├── redux/
│   │   └── store.js
│   └── reducers/
│       ├── flightReducer.js
│       └── userReducer.js
├── styles/            # SCSS stylesheets
│   ├── Dashboard.scss
│   ├── FlightChecklist.scss
│   ├── LoginPage.scss
│   ├── TaskDetails.scss
│   └── UserProfile.scss
├── tests/             # Unit tests
│   ├── FlightChecklist.test.js
│   ├── LoginPage.test.js
│   └── TaskDetails.test.js
├── utils/             # Utility functions
│   └── api.js
├── index.js           # Entry point
└── index.html         # HTML template
```
Available Scripts
In the project directory, you can run:
```bash
npm start: Runs the app in development mode.
```
```bash
npm run build: Builds the app for production.
```
```bash
npm test: Launches the test runner in interactive watch mode.
```
Testing
The application uses Jest and React Testing Library for unit testing.

To run tests:

```bash
npm test
```
Ensure that @testing-library/jest-dom is installed and properly configured in your setupTests.js file to utilize custom matchers like toBeInTheDocument.