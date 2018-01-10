package com.ranamahmud.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {
        ImageView imageViewCookie = findViewById(R.id.imageCookie);
        imageViewCookie.setImageResource(R.drawable.after);
        TextView textViewCookie = findViewById(R.id.textCookie);
        textViewCookie.setText("I'm so full");
    }
}
