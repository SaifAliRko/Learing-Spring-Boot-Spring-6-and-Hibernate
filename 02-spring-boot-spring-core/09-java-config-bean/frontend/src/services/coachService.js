import axios from 'axios'

const API_BASE_URL = 'http://localhost:8080'

export const coachService = {
  getDailyWorkout: async () => {
    try {
      const response = await axios.get(`${API_BASE_URL}/dailyworkout`)
      return response.data
    } catch (error) {
      console.error('Error fetching daily workout:', error)
      throw error
    }
  }
}

export default coachService
