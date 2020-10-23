package com.example.menuoptions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=(LinearLayout)findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);

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

        return true;
    }

    public void buttonPressed(View view)
    {
        Intent si=new Intent(this, Activity2.class);
        startActivity(si);
    }
}
