package com.example.shiao.taskr;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;


/**
 * Created by shiao on 1/15/2017.
 */

public class SundayActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_window);
        TextView textView = (TextView) findViewById(R.id.pop_text);

        // Hardcode message 1-15-17
        textView.setText("Chest:\n\nFlat Dumbbell Press (Bench Press): 4 sets x 10 to 12 reps\n" +
                "Flat Dumbbell Fly: 4 sets x 10 to 15 reps with a super set up pushups 4 sets 10-20 reps\n" +
                "(do your set of flys…set the dumbbells down and go right into pushups)\n" +
                "\n" +
                "Body Weight Dips (machine assisted dips if needed) 3 sets x 12-20 reps\n" +
                "Peck Deck 4 sets x 10 to 15 reps\n" +
                "Cable Flys (standing in the cage with cables on top position) 4 sets x 10 reps\n" +
                "You will be tired at this point but time to do some shoulders!\n\nShoulders:\n" +
                "\n" +
                "Dumbbell side raises: 3 sets x 10 to 12 reps\n" +
                "Shoulder Press (dumbbell or bar) 4 sets x 8 to 12 reps with a super set of front raises using dumbbells (after your shoulder press…set the weight down and grab some lighter dumbbells for front raises) 4 sets x 12 to 15 reps\n" +
                "Rear Peck Deck: 3 sets x 12- 15 reps");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));


    }
}
