package com.example.lab3_3kt;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Button button2to1 = findViewById(R.id.bnToFirst);
        button2to1.setOnClickListener(view1 -> {
            Intent intent = new Intent(ActivitySecond.this, ActivityFirst.class);
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        });

        Button button2to3 = findViewById(R.id.bnToThird);
        button2to3.setOnClickListener(view2 -> {
            Intent intent = new Intent(ActivitySecond.this, ActivityThird.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(ActivitySecond.this, ActivityAbout.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
