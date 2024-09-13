package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;


public class WeatherFragment extends Fragment {

    protected String city;
    protected int weather_icon;

    public WeatherFragment(){

    }

    public static WeatherFragment newInstance(String city, int weather_icon) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString("city",city);
        args.putInt("weather_icon",weather_icon);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            city = getArguments().getString("city");
            weather_icon = getArguments().getInt("weather_icon");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        TextView cityView = view.findViewById(R.id.city_name);
        ImageView weatherIconView = view.findViewById(R.id.weather_icon);

        cityView.setText(city);
        weatherIconView.setImageResource(weather_icon);

        return view;
    }
}