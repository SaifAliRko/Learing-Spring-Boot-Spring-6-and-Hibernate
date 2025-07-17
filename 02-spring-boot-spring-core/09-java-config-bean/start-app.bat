@echo off
echo Starting Spring Boot Backend...
echo.
echo Please make sure you have the backend running first!
echo Navigate to the project root and run: mvnw spring-boot:run
echo.
echo The backend should be running on http://localhost:8080
echo.
pause
echo.
echo Starting React Frontend...
cd frontend
npm run dev
pause
