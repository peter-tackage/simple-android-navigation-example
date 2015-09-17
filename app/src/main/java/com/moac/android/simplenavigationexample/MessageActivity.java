package com.moac.android.simplenavigationexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    private static final String NAME_KEY = "NAME";

    public static void launch(Context context, String name) {
        // Create an "Intent" to launch this Activity - supply the "name" argument too.
        Intent launchIntent = new Intent(context, MessageActivity.class);
        launchIntent.putExtra(NAME_KEY, name);
        context.startActivity(launchIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        // Retrieve the name argument from the intent.
        String name = getIntent().getStringExtra(NAME_KEY);

        // Set the name into the UI.
        TextView nameTextView = (TextView) findViewById(R.id.textView_name);
        nameTextView.setText(name);
    }

}
