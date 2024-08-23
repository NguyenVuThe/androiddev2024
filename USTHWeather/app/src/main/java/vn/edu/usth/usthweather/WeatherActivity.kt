package vn.edu.usth.usthweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.util.Log

class WeatherActivity : ComponentActivity() {
    private val TAG = "WeatherActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Start")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Resume")
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
