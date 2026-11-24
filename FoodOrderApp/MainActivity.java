package com.example.foodorderapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox food1, food2, food3, food4;
    Button ButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        food1 = findViewById(R.id.food1);
        food2 = findViewById(R.id.food2);
        food3 = findViewById(R.id.food3);
        food4 = findViewById(R.id.food4);
        ButtonSubmit = findViewById(R.id.ButtonSumbit);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder myfooditems = new StringBuilder();
                if (food1.isChecked())
                    myfooditems.append(food1.getText().toString());
                if (food2.isChecked())
                    myfooditems.append(" " + food2.getText().toString());
                if (food3.isChecked())
                    myfooditems.append(" " + food3.getText().toString());
                if (food4.isChecked())
                    myfooditems.append(" " + food4.getText().toString());
                Toast.makeText(MainActivity.this, "The Selected Food items = " + myfooditems, Toast.LENGTH_LONG).show();
            }
        });
    }
}
