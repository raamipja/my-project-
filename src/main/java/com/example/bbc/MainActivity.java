package com.example.bbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static MainActivity instance;
    private String name;
    private EditText webaddress;
    private Button touch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;
        webaddress = (EditText) findViewById(R.id.ipAddress);
        name = webaddress.getText().toString();

        touch1 =findViewById(R.id.touvh1);
        touch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T();
            }
        });
    }

    private void T() {
        Intent intent=new Intent(this,web.class);
        startActivity(intent);
    }

    public static MainActivity getInstance() {
        return instance;
    }

    public String getString() {
        return name ;
    }
}