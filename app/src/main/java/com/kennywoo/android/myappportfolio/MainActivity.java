package com.kennywoo.android.myappportfolio;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** POPULAR MOVIES Button */
    private Button mPopularMoviesButton;

    /** STOCK HAWK Button */
    private Button mStockHawkButton;

    /** BUILD IT BIGGER Button */
    private Button mBuildItBiggerButton;

    /** MAKE YOUR APP MATERIAL Button */
    private Button mMakeMaterialButton;

    /** GO UBIQUITOUS Button */
    private Button mGoUbiquitousButton;

    /** CAPSTONE Button */
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get 'POPULAR MOVIES' button by id from view and add listener
        mPopularMoviesButton = (Button) findViewById(R.id.popular_movies_button);
        mPopularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.popular_movies_button), Toast.LENGTH_SHORT);
            }
        });

        // Get 'STOCK HAWK' button by id from view and add listener
        mStockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        mStockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.stock_hawk_button), Toast.LENGTH_SHORT);
            }
        });

        // Get 'BUILD IT BIGGER' button by id from view and add listener
        mBuildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.build_bigger_button), Toast.LENGTH_SHORT);
            }
        });

        // Get 'MAKE YOUR APP MATERIAL' button by id from view and add listener
        mMakeMaterialButton = (Button) findViewById(R.id.make_material_button);
        mMakeMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.make_material_button), Toast.LENGTH_SHORT);
            }
        });

        // Get 'GO UBIQUITOUS' button by id from view and add listener
        mGoUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        mGoUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.go_ubiquitous_button), Toast.LENGTH_SHORT);
            }
        });

        // Get 'CAPSTONE' button by id from view and add listener
        mCapstoneButton = (Button) findViewById(R.id.capstone_button);
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(R.string.capstone_button), Toast.LENGTH_SHORT);
            }
        });
    }

    @NonNull
    private String getToastText(int buttonTitle) {
        return "This button will launch my " + buttonTitle + " app";
    }

}
