package edu.tufts.cs.jumbodrinkcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num_drinks = 0;
    TextView drink_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drink_display = (TextView)findViewById(R.id.drink_count);
    }

    public void add_drink(View view) {
        num_drinks++;
        String num_drinks_s = Integer.toString(num_drinks);
        drink_display.setText(num_drinks_s);
        if (num_drinks > 8) {
            android.content.Intent menuIntent = new android.content.Intent(this, StopDrinkingScreen.class);
            startActivity(menuIntent);
        }
    }
}
