package com.example.shiao.taskr;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by shiao on 1/15/2017.
 */

public class WednesdayActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_window);
        TextView textView = (TextView) findViewById(R.id.pop_text);

        // Hardcode message 1-15-17
        textView.setText("Biceps:\n" +
                "\n" +
                "Straight bar curls: 4 sets x 10 to 15 reps\n" +
                "Seated alternating dumbbell curls: 3 sets x 10 to 15 reps\n" +
                "Cabell Bicep Curls with EZ curl bar (bar that looks like a “w”) 4 sets x 10 to 15 reps\n" +
                "Hammer Curl Drop Set: 3 sets x 10 reps with heavy weight and then 12 reps with lighter weight (do your set of hammer curls….then as soon as you are finished with the set drop those weights and grab the next lighter weight and do 10 to 12 more reps) Burn baby burn\n" +
                "Cardio:\n" +
                "\n" +
                "30 min of cardio in your target heart rate");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));


    }
}
