const About = () => {
  return (
    <div style={{ padding: '20px', maxWidth: '800px', margin: '0 auto' }}>
      <h1 style={{ color: '#333', textAlign: 'center', marginBottom: '30px' }}>
        About the Coach App
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
          Technical Stack
        </h2>

        <div
          style={{
            display: 'grid',
            gridTemplateColumns: '1fr 1fr',
            gap: '30px'
          }}
        >
          <div>
            <h3 style={{ color: '#495057', marginBottom: '15px' }}>Backend</h3>
            <ul
              style={{ color: '#6c757d', fontSize: '16px', lineHeight: '1.6' }}
            >
              <li>Spring Boot 3</li>
              <li>Spring Framework 6</li>
              <li>Java Configuration</li>
              <li>Dependency Injection</li>
              <li>REST API</li>
            </ul>
          </div>

          <div>
            <h3 style={{ color: '#495057', marginBottom: '15px' }}>Frontend</h3>
            <ul
              style={{ color: '#6c757d', fontSize: '16px', lineHeight: '1.6' }}
            >
              <li>React 18</li>
              <li>Vite</li>
              <li>React Router</li>
              <li>Axios</li>
              <li>Modern CSS</li>
            </ul>
          </div>
        </div>
      </div>

      <div
        style={{
          backgroundColor: '#e9ecef',
          padding: '30px',
          borderRadius: '8px',
          border: '1px solid #dee2e6'
        }}
      >
        <h2 style={{ color: '#495057', marginBottom: '20px' }}>
          Application Architecture
        </h2>

        <p
          style={{
            color: '#6c757d',
            fontSize: '16px',
            lineHeight: '1.6',
            marginBottom: '15px'
          }}
        >
          This application demonstrates a clean separation between frontend and
          backend:
        </p>

        <ul style={{ color: '#6c757d', fontSize: '16px', lineHeight: '1.6' }}>
          <li>
            <strong>Backend (Port 8080):</strong> Spring Boot REST API that
            provides coaching services
          </li>
          <li>
            <strong>Frontend (Port 3000):</strong> React application that
            consumes the API
          </li>
          <li>
            <strong>Communication:</strong> HTTP requests using Axios with proxy
            configuration
          </li>
          <li>
            <strong>Data Flow:</strong> Frontend fetches data from backend and
            displays it to users
          </li>
        </ul>
      </div>
    </div>
  )
}

export default About
