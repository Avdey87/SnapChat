package com.avdey.snapchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SnapActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap);

        TextView text = findViewById(R.id.text_view);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE);
        text.setText(message);
    }
}
