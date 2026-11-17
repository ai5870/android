package com.example.mycalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText inputOperand1, inputOperand2;

    TextView printResult;

    Button btnAdd,btnSub,btnMul,btnDiv,btnMod,btnCle;
    double num1=0,num2=0,result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inputOperand1=findViewById(R.id.editTextN1);
        inputOperand2=findViewById(R.id.editTextN2);
        printResult=findViewById(R.id.textViewResult);
        btnAdd=findViewById(R.id.buttonAdd);
        btnSub=findViewById(R.id.buttonSub);
        btnDiv=findViewById(R.id.buttonDiv);
        btnMul=findViewById(R.id.buttonMul);
        btnMod=findViewById(R.id.buttonMod);
        btnCle=findViewById(R.id.buttonClear);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inputOperand1.getText().toString().isEmpty() || inputOperand2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "input is required", Toast.LENGTH_SHORT).show();
                else {

                    num1 = Double.parseDouble(inputOperand1.getText().toString());
                    num2 = Double.parseDouble(inputOperand2.getText().toString());
                    result = num1 + num2;

                    printResult.setText(String.valueOf(result));
                }


            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inputOperand1.getText().toString().isEmpty()||inputOperand2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "input is required", Toast.LENGTH_SHORT).show();
                else {

                    num1 = Double.parseDouble(inputOperand1.getText().toString());
                    num2 = Double.parseDouble(inputOperand2.getText().toString());
                    result = num1 - num2;

                    printResult.setText(String.valueOf(result));
                }


            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inputOperand1.getText().toString().isEmpty()||inputOperand2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "input is required", Toast.LENGTH_SHORT).show();
                else {

                    num1 = Double.parseDouble(inputOperand1.getText().toString());
                    num2 = Double.parseDouble(inputOperand2.getText().toString());
                    result = num1 * num2;

                    printResult.setText(String.valueOf(result));
                }


            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inputOperand1.getText().toString().isEmpty()||inputOperand2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "input is required", Toast.LENGTH_SHORT).show();
                else {

                    num1 = Double.parseDouble(inputOperand1.getText().toString());
                    num2 = Double.parseDouble(inputOperand2.getText().toString());

                    if(num2==0)
                        Toast.makeText(MainActivity.this, "zero divison error", Toast.LENGTH_SHORT).show();
                    else {
                    result = num1 - num2;
                    printResult.setText(String.valueOf(result));
                }}


            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inputOperand1.getText().toString().isEmpty()||inputOperand2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "input is required", Toast.LENGTH_SHORT).show();
                else {

                    num1 = Double.parseDouble(inputOperand1.getText().toString());
                    num2 = Double.parseDouble(inputOperand2.getText().toString());
                    result = num1 - num2;

                    printResult.setText(String.valueOf(result));
                }


            }
        });
        btnCle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputOperand1.setText(null);
                inputOperand2.setText(null);
                printResult.setText(null);



            }
        });
    }
}