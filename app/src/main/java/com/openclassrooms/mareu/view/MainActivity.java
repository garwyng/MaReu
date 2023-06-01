package com.openclassrooms.mareu.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.view.fragment.MyMeetingsFragment;

public class MainActivity extends AppCompatActivity {
    MyMeetingsFragment mMyMeetingsFragment = new MyMeetingsFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView3, mMyMeetingsFragment).commit();

    }
}

