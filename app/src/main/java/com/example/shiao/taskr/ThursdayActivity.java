package com.example.shiao.taskr;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by shiao on 1/15/2017.
 */

public class ThursdayActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_window);
        TextView textView = (TextView) findViewById(R.id.pop_text);

        // Hardcode message 1-15-17
        textView.setText("Rest day.");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));


    }
}
