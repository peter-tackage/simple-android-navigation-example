package com.moac.android.simplenavigationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind the Views that we use.
        final EditText nameEditText = (EditText) findViewById(R.id.editText_name);
        Button welcomeButton = (Button) findViewById(R.id.button_welcome);

        // Set an action to perform when the Button is clicked.
        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                // Make sure the name isn't empty
                if (!TextUtils.isEmpty(name)) {
                    Log.d(TAG, "Your name is: " + name);
                    // TODO Open new Activity to display the personalized welcome message
                }
            }
        });
    }

}
