package com.avdey.snapchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SnapChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap_chat);
    }

    public void onClickActivity(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, SnapActivity.class);
        intent.putExtra(SnapActivity.MESSAGE, message);

        startActivity(intent);
    }

    public void onClickIntent(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        Intent chg = Intent.createChooser(intent, "Метод отправки");
        intent.putExtra(Intent.EXTRA_TEXT, message);

        startActivity(chg);
    }
}
