package com.example.harsh.octiontestproject;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    FrameLayout container;
    TextView current, upcomming;
    View currentSelected, upcommingSelcted;
    Fragment currentFragment, upcommingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        currentFragment = new CurrentItemFragment();
        container = (FrameLayout) findViewById(R.id.cotainer);
        current = (TextView) findViewById(R.id.textView);
        upcomming = (TextView) findViewById(R.id.textView2);
        currentSelected = findViewById(R.id.view);
        upcommingSelcted = findViewById(R.id.view2);
        showCurrentFragment();
        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCurrentFragment();
            }
        });
        upcomming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showUpcommingFragment();

            }
        });

    }

    private void showCurrentFragment() {
        currentSelected.setVisibility(View.VISIBLE);
        upcommingSelcted.setVisibility(View.INVISIBLE);
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(container.getId(), currentFragment).commit();
    }

    private void showUpcommingFragment() {

    }

}
