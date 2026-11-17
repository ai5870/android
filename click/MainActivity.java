package com.example.click;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    TextView mytext;
    ConstraintLayout mylayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btn=findViewById(R.id.imageButton);
        mylayout=findViewById(R.id.main);
        mytext=findViewById(R.id.textView3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void changeColor(View view){
        Random random=new Random();
        int red=0,green=0,blue=0;
        red= random.nextInt(255);
        green= random.nextInt(255);
        blue= random.nextInt(255);


        int myColor=Color.argb(255,red,green,blue);
        mytext.setText("Red="+red+"Green" +green+"Blue"+blue);
        mylayout.setBackgroundColor(myColor);

    }
}