package com.example.shiao.taskr;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by shiao on 1/15/2017.
 */

public class SaturdayActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_window);
        TextView textView = (TextView) findViewById(R.id.pop_text);

        // Hardcode message 1-15-17
        textView.setText("Back:\n" +
                "\n" +
                "Lat Pull Down with Close grip: 4 sets x 10 to 12 reps\n" +
                "Seated Row: 4 sets x 10 to 12 reps\n" +
                "Pull Ups (this will be fun after the first two exercises) 4 sets x as many reps as you can get\n" +
                "One arm Dumbbell Row: 3 sets x 8 to 12 reps super setting with stiff arm pushdowns: 3 sets x 12 to 15 reps\n" +
                "Close Grip Pull Ups: 3 sets x as many reps as you can get\n" +
                "You should be beat up after this workout\n" +
                "\n" +
                "Abs:\n" +
                "\n" +
                "Crunches on the bench: 4 sets body weight x 25 reps (if you want to hold a 3 or 5 pound dumbbell in our feet to make it hard…go for it\n" +
                "Cabell Crunches: 4 sets x 20 reps\n" +
                "Hanging leg Raises: 4 sets x 12 to 20 reps");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));


    }
}
