package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "Create");

        ForecastFragment firstFragment = new ForecastFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, "Start");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "Resume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Stop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "Destroy");
    }
}