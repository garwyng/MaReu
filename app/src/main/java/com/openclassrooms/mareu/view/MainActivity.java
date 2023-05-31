package com.openclassrooms.mareu.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.controler.MyMeetingApiService;
import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.view.fragment.MyMeetingsFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyMeetingApiService service = new MyMeetingApiService();
    List<Meeting> meetingsList = service.getMeetingsList();
    MyMeetingsFragment mMyMeetingsFragment = new MyMeetingsFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView3, mMyMeetingsFragment).commit();






    }
}
