package com.example.parinay03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                Button Button = findViewById(R.id.button);

                Button.setOnClickListener(clk -> {
                    // Handle the button click
                    Intent nextPage = new Intent(MainActivity.this, Secondactivity.class);
                    startActivity(nextPage);
                    Intent next = new Intent( nextPage);
                    next.putExtra("Age", "");
                    next.putExtra("Name", "");
                    next.putExtra("PostalCode", "");

                });

            }

            @Override
            protected void onStart() {
                super.onStart();
                Log.w( "MainActivity", "Application is now visible on screen" );

            }

            @Override
            protected void onPostResume() {
                super.onPostResume();
                Log.w( "MainActivity", "Application is now responding to the user input" );

            }

            @Override
            protected void onPause() {
                super.onPause();
                Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

            }

            @Override
            protected void onStop() {
                super.onStop();
                Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

            }

            @Override
            protected void onDestroy() {
                super.onDestroy();
                Log.w( "MainActivity", "In onCreate() - Loading Widgets" );


    }
}