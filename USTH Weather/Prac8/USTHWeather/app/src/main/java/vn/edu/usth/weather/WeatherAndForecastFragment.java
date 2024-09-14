package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherAndForecastFragment extends Fragment {


    public static WeatherAndForecastFragment newInstance(String city, int weather_icon, String temp) {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        args.putString("city", city);
        args.putInt("weather_icon",weather_icon);
        args.putString("temp",temp);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            city = getArguments().getString("city");
//            weather_icon = getArguments().getInt("weather_icon");
//            temp = getArguments().getString("temp");
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weatherandforecast, container, false);

        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.fragment_forecast, new ForecastFragment());
        transaction.replace(R.id.fragment_weather, new WeatherFragment());

        transaction.commit();

        return view;
    }

}
