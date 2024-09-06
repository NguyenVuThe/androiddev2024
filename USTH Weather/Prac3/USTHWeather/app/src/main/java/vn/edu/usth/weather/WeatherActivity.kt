package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import vn.edu.usth.weather.ui.theme.USTHWeatherTheme

class WeatherActivity : FragmentActivity() {
    private val TAG = "WeatherActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_activity)

        val firstFragment = ForecastFragment()


        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, firstFragment)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Start")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Resume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Pause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Stop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Destroy")
    }
}