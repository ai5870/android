package com.example.dateofjoinn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText stName,dateofjoin;
    CalendarView mycalendar;

    Spinner colBranches;

    Button submit;

    String doj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        stName=findViewById(R.id.editTextText);
        dateofjoin=findViewById(R.id.editTextText2);
        mycalendar=findViewById(R.id.calendarView);
        colBranches=findViewById(R.id.spinner);
        submit=findViewById(R.id.button);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mycalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                doj=dayOfMonth+"/"+(month+1)+"/"+year;
                dateofjoin.setText(doj);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=stName.getText().toString();
                String  stBranch=colBranches.getSelectedItem().toString();

                Toast.makeText(MainActivity.this, name+"joined the"+stBranch+"on"+doj, Toast.LENGTH_SHORT).show();

            }
        });
    }
}