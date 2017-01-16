package com.example.shiao.taskr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static android.widget.ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Display list items
        showList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showList() {
        // Get ListView object from xml
        listView = (android.widget.ListView) findViewById(R.id.activity_list);

        ArrayList<String> values = new ArrayList<>();
        values.add("Sunday");
        values.add("Monday");
        values.add("Tuesday");
        values.add("Wednesday");
        values.add("Thursday");
        values.add("Friday");
        values.add("Saturday");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign listView's adapter to adapter (references values ArrayList)
        listView.setAdapter(adapter);

        // List on-click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "  View Detail : " +itemValue , Toast.LENGTH_SHORT)
                        .show();

                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, SundayActivity.class));
                } else if (position == 1) {
                    startActivity(new Intent(MainActivity.this, MondayActivity.class));
                } else if (position == 2) {
                    startActivity(new Intent(MainActivity.this, TuesdayActivity.class));
                } else if (position == 3) {
                    startActivity(new Intent(MainActivity.this, WednesdayActivity.class));
                } else if (position == 4) {
                    startActivity(new Intent(MainActivity.this, ThursdayActivity.class));
                } else if (position == 5) {
                    startActivity(new Intent(MainActivity.this, FridayActivity.class));
                } else if (position == 6) {
                    startActivity(new Intent(MainActivity.this, SaturdayActivity.class));
                }

            }
        });
    }
}
