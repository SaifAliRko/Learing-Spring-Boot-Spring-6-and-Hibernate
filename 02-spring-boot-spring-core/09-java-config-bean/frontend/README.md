# Spring Boot Coach App with React Frontend

This is a full-stack application built with Spring Boot backend and React
frontend using Vite.

## Project Structure

```
├── src/main/java/com/luv2code/springcoredemo/
│   ├── SpringcoredemoApplication.java
│   ├── common/
│   │   ├── Coach.java (interface)
│   │   └── SwimCoach.java
│   ├── config/
│   │   ├── SportConfig.java
│   │   └── WebConfig.java (CORS configuration)
│   └── rest/
│       └── DemoController.java
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   │   ├── Home.jsx
│   │   │   ├── DailyWorkout.jsx
│   │   │   ├── About.jsx
│   │   │   └── Navbar.jsx
│   │   ├── services/
│   │   │   └── coachService.js
│   │   ├── App.jsx
│   │   └── main.jsx
│   └── package.json
└── pom.xml
```

## Features

- **Backend**: Spring Boot REST API with dependency injection
- **Frontend**: React with modern hooks and routing
- **Communication**: HTTP requests between frontend and backend
- **CORS**: Properly configured for cross-origin requests
- **Error Handling**: Loading states and error messages
- **Responsive Design**: Modern UI with clean styling

## API Endpoints

- `GET /dailyworkout` - Returns daily workout from SwimCoach

## How to Run

### Backend (Spring Boot)

1. Navigate to the project root directory
2. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
   Or in Windows:
   ```cmd
   mvnw spring-boot:run
   ```
3. The backend will start on `http://localhost:8080`

### Frontend (React)

1. Navigate to the frontend directory:

   ```bash
   cd frontend
   ```

2. Install dependencies:

   ```bash
   npm install
   ```

3. Start the development server:

   ```bash
   npm run dev
   ```

4. The frontend will start on `http://localhost:3000`

## Usage

1. Start the backend server first
2. Start the frontend development server
3. Open your browser and go to `http://localhost:3000`
4. Navigate through the application:
   - **Home**: Overview of the application
   - **Daily Workout**: Fetch and display workout from backend
   - **About**: Technical information about the stack

## Technology Stack

### Backend

- Spring Boot 3
- Spring Framework 6
- Java Configuration
- Dependency Injection
- REST API

### Frontend

- React 18
- Vite
- React Router
- Axios
- Modern CSS

## Development Notes

- The frontend uses Vite for fast development and building
- CORS is configured to allow requests from `http://localhost:3000`
- The application demonstrates clean separation between frontend and backend
- All API calls are handled through a service layer
- Error handling and loading states are implemented

## Next Steps

You can extend this application by:

- Adding more coach types (BaseballCoach, TennisCoach, etc.)
- Implementing more API endpoints
- Adding user authentication
- Integrating with a database
- Adding more React components and features
