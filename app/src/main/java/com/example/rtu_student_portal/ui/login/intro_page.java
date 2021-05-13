package com.example.rtu_student_portal.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rtu_student_portal.R;

public class intro_page extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIMEOUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_intro_page);

        Animation fadeOut = new AlphaAnimation(0,1);
        fadeOut.setStartOffset(500);
        fadeOut.setDuration(1800);
        ImageView image = findViewById(R.id.rtuLogo);
        TextView textRTU = findViewById(R.id.displayRTU);
        TextView textStudentPortal = findViewById(R.id.studentPortal);

        image.setAnimation(fadeOut);
        textRTU.setAnimation(fadeOut);
        textStudentPortal.setAnimation(fadeOut);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(intro_page.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }
}