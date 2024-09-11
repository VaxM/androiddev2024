package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.fragment.app.FragmentPagerAdapter; // Add this import
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ViewPager viewPager = findViewById(R.id.viewPager);
        WeatherAndForecastPagerAdapter adapter = new WeatherAndForecastPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("start", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resume", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("pause", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("stop", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("destroy", "onDestroy called");
    }
}