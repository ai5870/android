package com.example.foodorderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
     Toolbar tool;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menu=getMenuInflater();
        menu.inflate(R.menu.myoptionmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;

        if(item.getItemId()==R.id.activity1)
            intent=new Intent(MainActivity.this,MainActivity1.class);
        StartActivity(intent);
        if(item.getItemId()==R.id.activity2)
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tool=findViewById(R.id.toolbar);
        setSupportActionBar(tool);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        })
    }
}