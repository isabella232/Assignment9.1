package com.niketgoel.assignment91;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declaring TextView to handle the MainActivity Text
    private TextView activityText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityText = (TextView)findViewById(R.id.activityText);
    }

    /**
     * onCreateOptionsMenu to inflate the menu option in action bar
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    /**
     * onOptionsItemSelected to perform the click action on clicking items
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.Red:
                activityText.setText("Hey ! I am Red");
                activityText.setTextColor(getResources().getColor(R.color.Red,null));
                Toast.makeText(getApplicationContext(), "Red Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Green:
                activityText.setText("Hey ! I am Green");
                activityText.setTextColor(getResources().getColor(R.color.Green,null));
                Toast.makeText(getApplicationContext(), "Green Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Blue:
                activityText.setText("Hey ! I am Blue");
                activityText.setTextColor(getResources().getColor(R.color.Blue,null));
                Toast.makeText(getApplicationContext(), "Blue Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
