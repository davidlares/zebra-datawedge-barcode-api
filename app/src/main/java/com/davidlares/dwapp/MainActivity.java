package com.davidlares.dwapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;
import android.widget.TextView;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiating textView
        result = findViewById(R.id.result);
        // detecting OS
        if (Build.MANUFACTURER.contains("Zebra Technologies") || Build.MANUFACTURER.contains("Motorola Solutions")) {
            IntentFilter filter = new IntentFilter();
            filter.addCategory(Intent.CATEGORY_DEFAULT);
            filter.addAction(getResources().getString(R.string.activity_intent));
            // then move on, lets' register
            registerReceiver(broadcastReceiver, filter);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadcastReceiver);
    }

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle b = intent.getExtras();
            // checking if the mentioned action exists
            if(action.equals(getResources().getString(R.string.activity_intent))) {
                try {
                    // showing results
                    displayResults(intent);
                } catch(Exception e) {
                    Log.d("DWApp", "Error occurred" + e.getMessage());
                }
            }
        }
    };

    private void displayResults(Intent initiating) {
        String content = initiating.getStringExtra(getResources().getString(R.string.datawedge_data));
        Log.d("DWApp", "Resulting data: " + content);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                result.setText(content);
            }
        });
    }
}