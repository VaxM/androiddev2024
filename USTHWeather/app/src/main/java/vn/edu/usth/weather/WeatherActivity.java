package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
        Log.i("create", "onCreate called");
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