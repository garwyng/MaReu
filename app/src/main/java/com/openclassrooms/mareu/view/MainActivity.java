package com.openclassrooms.mareu.view;

import static com.openclassrooms.mareu.R.id.floating_button_AddMeeting;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.controler.MyMeetingApiService;
import com.openclassrooms.mareu.di.DI;
import com.openclassrooms.mareu.view.fragment.DatePickerFragement;
import com.openclassrooms.mareu.view.fragment.MyMeetingsFragment;
import com.openclassrooms.mareu.view.fragment.SelectionFilterFragement;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    MyMeetingsFragment mMyMeetingsFragment = new MyMeetingsFragment();
    private Fragment mSelectionFilterFragement = new SelectionFilterFragement();
    private MyMeetingApiService mApiService = DI.getMyMeetingApiService();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String date = mApiService.getStringCurrentDate();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView3, mMyMeetingsFragment).commit();
        FloatingActionButton mFloatingActionButtonAddMeeting = findViewById(floating_button_AddMeeting);

        TextView mTexView = findViewById(R.id.textViewDate);
        ImageButton imageButtonFilter =findViewById(R.id.imageButtonFilter);
        imageButtonFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().add(R.id.fragmentContainerView3,mSelectionFilterFragement).commit();
            }
        });
        //to do : replacer par une methode( filtre?) qui affiche la date selectionner ou la date du jour par defaut
        mTexView.setText(date);
        mFloatingActionButtonAddMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                mFloatingActionButtonAddMeeting.setImageResource(R.drawable.ic_action_name);
                DatePickerFragement mDatePickerFragement = new DatePickerFragement();
                mDatePickerFragement.show(getFragmentManager(),"date picker");
                }

        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar cal = Calendar.getInstance();
         year = cal.get(Calendar.YEAR);
         month = cal.get(Calendar.MONTH);
         dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

    }
}

