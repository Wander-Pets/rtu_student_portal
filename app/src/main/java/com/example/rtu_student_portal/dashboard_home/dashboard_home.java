package com.example.rtu_student_portal.dashboard_home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rtu_student_portal.R;

public class dashboard_home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_home);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, enrollment_registration.class);
        startActivity(intent);
    }
}