package com.openclassrooms.mareu.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.controler.MyMeetingApiService;
import com.openclassrooms.mareu.di.DI;
import com.openclassrooms.mareu.events.DeleteMeetingEvent;
import com.openclassrooms.mareu.model.Meeting;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;




/**
 * A fragment representing a list of Items.
 */
public class MyMeetingsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private final MyMeetingApiService service = DI.getMyMeetingApiService();
    List<Meeting> meetingsList;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */

    public static MyMeetingsFragment newInstance() {
        MyMeetingsFragment fragment = new MyMeetingsFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_meetings_list, container, false);
            Context context = view.getContext();
            mRecyclerView = (RecyclerView) view;
            mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        return view;
    }
    private void initMeetingsList(){
        meetingsList = service.getMeetingsList();
        mRecyclerView.setAdapter(new MyItemRecyclerViewAdapter(meetingsList));
    }
    @Override
    public void onResume(){
        super.onResume();
        initMeetingsList();
    }
    /**
     *
     */
    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }
    /**
     *
     */
    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
    @Subscribe
    public void onDeleteMeeting(DeleteMeetingEvent event){
        service.deleteMeeting(event.meeting);
        initMeetingsList();
    }

}