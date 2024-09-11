package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherAndForecastPagerAdapter extends FragmentPagerAdapter {

    public WeatherAndForecastPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return WeatherAndForecastFragment.newInstance("param1", "param2");
    }

    @Override
    public int getCount() {
        return 3; // Number of pages
    }
}