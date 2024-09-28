package vn.edu.usth.weather;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";

    private String[] cities = {"Hanoi", "Paris", "Toulouse"};
    private int[] weatherIcons = {R.drawable.cloudy, R.drawable.partly_cloudy, R.drawable.cloudy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "Create");


        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Hanoi");
                    break;
                case 1:
                    tab.setText("Paris");
                    break;
                case 2:
                    tab.setText("Toulouse");
                    break;
            }
        }).attach();

        MediaPlayer music = MediaPlayer.create(WeatherActivity.this, R.raw.music);
        music.start();
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