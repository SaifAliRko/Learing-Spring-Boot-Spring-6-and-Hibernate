import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Navbar from './components/Navbar'
import Home from './components/Home'
import DailyWorkout from './components/DailyWorkout'
import About from './components/About'

function App() {
  return (
    <Router>
      <div
        style={{
          minHeight: '100vh',
          backgroundColor: '#ffffff',
          fontFamily: 'Arial, sans-serif'
        }}
      >
        <Navbar />
        <Routes>
          <Route
            path="/"
            element={<Home />}
          />
          <Route
            path="/workout"
            element={<DailyWorkout />}
          />
          <Route
            path="/about"
            element={<About />}
          />
        </Routes>

        <footer
          style={{
            backgroundColor: '#f8f9fa',
            padding: '20px 0',
            marginTop: '50px',
            borderTop: '1px solid #dee2e6',
            textAlign: 'center',
            color: '#6c757d'
          }}
        >
          <p>&copy; 2024 Coach App - Built with Spring Boot & React</p>
        </footer>
      </div>
    </Router>
  )
}

export default App
