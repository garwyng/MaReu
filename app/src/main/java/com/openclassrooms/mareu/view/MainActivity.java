package com.openclassrooms.mareu.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.view.fragment.AddMeetingFragment;
import com.openclassrooms.mareu.view.fragment.MyMeetingsFragment;

public class MainActivity extends AppCompatActivity {
    MyMeetingsFragment mMyMeetingsFragment = new MyMeetingsFragment();
    AddMeetingFragment mAddMeetingFragment = new AddMeetingFragment();
    FloatingActionButton mFloatingActionButtonAddMeeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView3, mMyMeetingsFragment).commit();
        mFloatingActionButtonAddMeeting= findViewById(R.id.floating_button_AddMeeting);
        mFloatingActionButtonAddMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView3, mAddMeetingFragment).commit();
                mFloatingActionButtonAddMeeting.setVisibility(View.INVISIBLE);
                }

        });

    }
}

