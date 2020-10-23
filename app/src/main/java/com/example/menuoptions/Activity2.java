package com.example.menuoptions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
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

    public void buttonPressed(View view)
    {
        finish();
    }
}
