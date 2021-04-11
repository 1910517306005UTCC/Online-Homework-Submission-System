package com.utcc.onlinehomeworksubmissionsystem;

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

        Button buttonSwitchToActivityMainStudent = findViewById(R.id.btnLogin);
        buttonSwitchToActivityMainStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ActivityMainStudent = new Intent(view.getContext(), MainStudent.class);
                startActivity(ActivityMainStudent);
            }
        });
    }
}