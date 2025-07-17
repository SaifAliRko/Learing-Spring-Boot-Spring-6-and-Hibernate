import { Link } from 'react-router-dom'

const Navbar = () => {
  return (
    <nav
      style={{
        backgroundColor: '#343a40',
        padding: '1rem 0',
        marginBottom: '2rem'
      }}
    >
      <div
        style={{
          maxWidth: '1200px',
          margin: '0 auto',
          display: 'flex',
          justifyContent: 'space-between',
          alignItems: 'center',
          padding: '0 20px'
        }}
      >
        <Link
          to="/"
          style={{
            color: 'white',
            textDecoration: 'none',
            fontSize: '1.5rem',
            fontWeight: 'bold'
          }}
        >
          Coach App
        </Link>

        <div style={{ display: 'flex', gap: '20px' }}>
          <Link
            to="/"
            style={{
              color: 'white',
              textDecoration: 'none',
              padding: '8px 16px',
              borderRadius: '4px',
              transition: 'background-color 0.3s'
            }}
            onMouseOver={(e) => (e.target.style.backgroundColor = '#495057')}
            onMouseOut={(e) => (e.target.style.backgroundColor = 'transparent')}
          >
            Home
          </Link>

          <Link
            to="/workout"
            style={{
              color: 'white',
              textDecoration: 'none',
              padding: '8px 16px',
              borderRadius: '4px',
              transition: 'background-color 0.3s'
            }}
            onMouseOver={(e) => (e.target.style.backgroundColor = '#495057')}
            onMouseOut={(e) => (e.target.style.backgroundColor = 'transparent')}
          >
            Daily Workout
          </Link>

          <Link
            to="/about"
            style={{
              color: 'white',
              textDecoration: 'none',
              padding: '8px 16px',
              borderRadius: '4px',
              transition: 'background-color 0.3s'
            }}
            onMouseOver={(e) => (e.target.style.backgroundColor = '#495057')}
            onMouseOut={(e) => (e.target.style.backgroundColor = 'transparent')}
          >
            About
          </Link>
        </div>
      </div>
    </nav>
  )
}

export default Navbar
