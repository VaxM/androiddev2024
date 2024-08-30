package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_forecast,container, false);

        // Create the main LinearLayout
        //LinearLayout layout = new LinearLayout(getContext());
        //layout.setOrientation(LinearLayout.VERTICAL);

        // Create and configure the TextView
        //TextView day = new TextView(getContext());
        //day.setText("Thursday");
        //day.setTextSize(24); // Optional: Set text size
        //day.setLayoutParams(new LinearLayout.LayoutParams(
        //        LinearLayout.LayoutParams.WRAP_CONTENT,
        //         LinearLayout.LayoutParams.WRAP_CONTENT));

        // Create and configure the ImageView
        //ImageView img = new ImageView(getContext());
        //img.setImageResource(R.drawable.sun);
        //img.setLayoutParams(new LinearLayout.LayoutParams(
        //        LinearLayout.LayoutParams.WRAP_CONTENT,
        //        LinearLayout.LayoutParams.WRAP_CONTENT));

        // Create a colored view (if needed)
        //View coloredView = new View(getContext());
        //coloredView.setBackgroundColor(Color.parseColor("#20FF0000"));
        //coloredView.setLayoutParams(new LinearLayout.LayoutParams(
        //        LinearLayout.LayoutParams.MATCH_PARENT,
        //        10)); // Height of the colored view

        // Add views to the layout
        //layout.addView(day);
        //layout.addView(img);
        //layout.addView(coloredView);

        // Return the main layout
        //return layout;
        return view;
    }
}