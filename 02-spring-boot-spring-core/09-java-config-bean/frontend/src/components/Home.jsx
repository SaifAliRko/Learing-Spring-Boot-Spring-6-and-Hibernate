const Home = () => {
  return (
    <div style={{ padding: '20px', maxWidth: '800px', margin: '0 auto' }}>
      <h1 style={{ color: '#333', textAlign: 'center', marginBottom: '30px' }}>
        Welcome to the Coach App
      </h1>

      <div
        style={{
          backgroundColor: '#f8f9fa',
          padding: '30px',
          borderRadius: '8px',
          border: '1px solid #dee2e6',
          marginBottom: '30px'
        }}
      >
        <h2 style={{ color: '#495057', marginBottom: '20px' }}>
          About This Application
        </h2>

        <p
          style={{
            color: '#6c757d',
            fontSize: '16px',
            lineHeight: '1.6',
            marginBottom: '15px'
          }}
        >
          This is a full-stack application built with Spring Boot backend and
          React frontend. The backend uses Spring's dependency injection and
          Java configuration to provide coaching services.
        </p>

        <p
          style={{
            color: '#6c757d',
            fontSize: '16px',
            lineHeight: '1.6',
            marginBottom: '15px'
          }}
        >
          Currently, the app features a SwimCoach that provides daily workout
          recommendations through a REST API endpoint.
        </p>

        <h3
          style={{ color: '#495057', marginTop: '25px', marginBottom: '15px' }}
        >
          Features:
        </h3>

        <ul style={{ color: '#6c757d', fontSize: '16px', lineHeight: '1.6' }}>
          <li>Spring Boot REST API backend</li>
          <li>React frontend with modern UI</li>
          <li>Real-time data fetching from backend</li>
          <li>Responsive design</li>
          <li>Error handling and loading states</li>
        </ul>
      </div>

      <div style={{ textAlign: 'center' }}>
        <a
          href="/workout"
          style={{
            backgroundColor: '#007bff',
            color: 'white',
            textDecoration: 'none',
            padding: '12px 24px',
            borderRadius: '4px',
            fontSize: '16px',
            display: 'inline-block',
            transition: 'background-color 0.3s'
          }}
          onMouseOver={(e) => (e.target.style.backgroundColor = '#0056b3')}
          onMouseOut={(e) => (e.target.style.backgroundColor = '#007bff')}
        >
          Get Your Daily Workout
        </a>
      </div>
    </div>
  )
}

export default Home
