package com.example.menuoptions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Activity2 extends AppCompatActivity
{
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        layout=(LinearLayout)findViewById(R.id.layout2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity2, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        String name=item.getTitle().toString();

        if (name.equals("Red"))
        {
            layout.setBackgroundColor(Color.RED);
        }
        else if (name.equals("Green"))
        {
            layout.setBackgroundColor(Color.GREEN);
        }
        else if (name.equals("Blue"))
        {
            layout.setBackgroundColor(Color.BLUE);
        }
        else if (name.equals("Yellow"))
        {
            layout.setBackgroundColor(Color.YELLOW);
        }

        return true;
    }

    public void buttonPressed(View view)
    {
        finish();
    }
}
