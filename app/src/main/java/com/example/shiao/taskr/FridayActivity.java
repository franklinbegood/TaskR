package com.example.shiao.taskr;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by shiao on 1/15/2017.
 */

public class FridayActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_window);
        TextView textView = (TextView) findViewById(R.id.pop_text);

        // Hardcode message 1-15-17
        textView.setText("Legs:\n" +
                "\n" +
                "Body Weight Squats (no weight just warming up the knees) 4 sets of 50 reps\n" +
                "Leg Extensions: 4 sets x 15 reps\n" +
                "Smith Machine Squats (or free weight squats if you know how to do it and be safe) 4 sets x 10 to 12 reps\n" +
                "Hamstring Curls: 4 sets x 12 to 15 reps\n" +
                "Walking lunges: 3 sets x 12 each leg (grab some dumbbells to make it more challenging)\n" +
                "Bench Step Ups: 3 sets x 10 to 12 reps each leg (holding dumbbells and keep your form perfect…don’t lean over and hurt your back)\n" +
                "Standing Calf Raises: 3 sets or body weight calf raises x 100 reps (should burn a tad)\n" +
                "Seated Calf Raises: 4 sets x 20 to 25 reps");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));


    }
}
