package com.example.customerui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button driverBtn = (Button) findViewById(R.id.btnDriver);
        Button userBtn = (Button) findViewById(R.id.btnUser);
        userBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, registerCustomerActivity.class);
                startActivity(intent);
            }
        });
    }
}