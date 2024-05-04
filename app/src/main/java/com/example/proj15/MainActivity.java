package com.example.proj15;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity
{
    int response;
    RadioGroup rg;
    RadioButton red, yellow, green, blue;
    Button btn;
    Switch swch;
    int respond;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        rg = findViewById(R.id.RadioGroup);
        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        swch = findViewById(R.id.switch1);
        layout = findViewById(R.id.background);


    }

    public void changeColorButton(View view)
    {
        if (!(swch.isChecked()))
        {
            if (red.isChecked())
            {
                layout.setBackgroundColor(Color.RED);
            }
            else if (green.isChecked())
            {
                layout.setBackgroundColor(Color.GREEN);
            }
            else if (blue.isChecked())
            {
                layout.setBackgroundColor(Color.BLUE);
            }
            else if (yellow.isChecked())
            {
                layout.setBackgroundColor(Color.YELLOW);
            }
            else
            {
                layout.setBackgroundColor(Color.WHITE);
            }
        }
    }

    public void redHasBeenChosen(View view)
    {
        if (swch.isChecked())
        {
            layout.setBackgroundColor(Color.RED);
        }
    }

    public void greenHasBeenChosen(View view)

    {
        if (swch.isChecked())
        {
            layout.setBackgroundColor(Color.GREEN);
        }
    }

    public void blueHasBeenChosen(View view)
    {
        if (swch.isChecked())
        {
            layout.setBackgroundColor(Color.BLUE);
        }
    }

    public void yellowHasBeenChosen(View view)
    {
        if (swch.isChecked())
        {
            layout.setBackgroundColor(Color.YELLOW);
        }
    }
}