package com.example.lab3_3kt;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityThird extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        Button button3to1 = findViewById(R.id.bnToFirst);
        button3to1.setOnClickListener(view1 -> {
            Intent intent = new Intent(ActivityThird.this, ActivityFirst.class);
            startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        });

        Button button3to2 = findViewById(R.id.bnToSecond);
        button3to2.setOnClickListener(view1 -> {
            Intent intent = new Intent(ActivityThird.this, ActivitySecond.class);
            startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP));
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
            Intent intent = new Intent(ActivityThird.this, ActivityAbout.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
