package com.example.smsandcalln;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText  phoneNo,smsBody;

    ImageButton btnCall,btnSms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        phoneNo=findViewById(R.id.editTextPhone);
        smsBody=findViewById(R.id.editTextSMSBody);
        btnCall=findViewById(R.id.imageButtonCall);
        btnSms=findViewById(R.id.imageButtonSMS);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNo.getText().toString()));
                startActivity(callIntent);

            }
        });
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent=new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms",phoneNo.getText().toString(),null));
                smsIntent.putExtra("sms_body",smsBody.getText().toString());
                startActivity(smsIntent);
            }
        });
    }
}