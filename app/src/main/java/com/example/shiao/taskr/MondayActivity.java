package com.example.shiao.taskr;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by shiao on 1/15/2017.
 */

public class MondayActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_window);
        TextView textView = (TextView) findViewById(R.id.pop_text);

        // Hardcode message 1-15-17
        textView.setText("Triceps:\n" +
                "\n" +
                "Tricep Push down with rope: 4 sets x 15 to 20 reps (do these very slow and pause the movement at the bottom of the exercise for 3 seconds before letting it up…this will burn like crazy!\n" +
                "Skull Crushers: 4 sets x 10 to 15 reps superset with tricep dips 4 sets 15 reps (after doing your skull crushers, set the bard down and on the same bench just swing out to the side and do your tricep dips.\n" +
                "Tricep kick Backs:  3 sets x 12 to 15 reps\n" +
                "Tricep Pushdowns with the straight bar: 4 sets x 12 to 20 reps\n" +
                "Cardio:\n" +
                "\n" +
                "30 to 45 min of cardio in your target heart rate zone:  This is calculated by taking 220-age and then multiply the number by .60 and .75 to get your range.");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));


    }
}
