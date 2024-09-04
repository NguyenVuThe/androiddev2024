package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        View view = new View(getContext());
//        view.setBackgroundColor(Color.parseColor("#20FF0000"));
//        return view;
        LinearLayout Layout = new LinearLayout(getContext());
        Layout.setOrientation(LinearLayout.VERTICAL);

        TextView text_view = new TextView(getContext());
        text_view.setText("Thursday");

        ImageView image_view = new ImageView(getContext());
        image_view.setImageResource(R.drawable.cloudy);

        Layout.addView(text_view);
        Layout.addView(image_view);

        return Layout;
    }
}