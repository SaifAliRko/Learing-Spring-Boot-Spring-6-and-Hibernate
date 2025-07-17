import { useState, useEffect } from 'react'
import coachService from '../services/coachService'

const DailyWorkout = () => {
  const [workout, setWorkout] = useState('')
  const [loading, setLoading] = useState(false)
  const [error, setError] = useState(null)

  const fetchWorkout = async () => {
    setLoading(true)
    setError(null)
    try {
      const workoutData = await coachService.getDailyWorkout()
      setWorkout(workoutData)
    } catch (err) {
      setError(
        'Failed to fetch workout. Make sure the backend is running on port 8080.'
      )
      console.error('Error:', err)
    } finally {
      setLoading(false)
    }
  }

  useEffect(() => {
    fetchWorkout()
  }, [])

  return (
    <div style={{ padding: '20px', maxWidth: '600px', margin: '0 auto' }}>
      <h2 style={{ color: '#333', textAlign: 'center', marginBottom: '30px' }}>
        Daily Workout
      </h2>

      <div
        style={{
          backgroundColor: '#f8f9fa',
          padding: '20px',
          borderRadius: '8px',
          border: '1px solid #dee2e6',
          marginBottom: '20px'
        }}
      >
        {loading && (
          <div style={{ textAlign: 'center', color: '#6c757d' }}>
            Loading workout...
          </div>
        )}

        {error && (
          <div
            style={{
              color: '#dc3545',
              backgroundColor: '#f8d7da',
              padding: '10px',
              borderRadius: '4px',
              border: '1px solid #f5c6cb'
            }}
          >
            {error}
          </div>
        )}

        {!loading && !error && workout && (
          <div
            style={{
              fontSize: '18px',
              color: '#495057',
              textAlign: 'center',
              fontWeight: '500'
            }}
          >
            {workout}
          </div>
        )}
      </div>

      <div style={{ textAlign: 'center' }}>
        <button
          onClick={fetchWorkout}
          disabled={loading}
          style={{
            backgroundColor: '#007bff',
            color: 'white',
            border: 'none',
            padding: '10px 20px',
            borderRadius: '4px',
            cursor: loading ? 'not-allowed' : 'pointer',
            fontSize: '16px',
            opacity: loading ? 0.6 : 1
          }}
        >
          {loading ? 'Loading...' : 'Get New Workout'}
        </button>
      </div>
    </div>
  )
}

export default DailyWorkout
