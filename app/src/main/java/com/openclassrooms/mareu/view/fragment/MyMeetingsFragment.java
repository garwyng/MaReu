package com.openclassrooms.mareu.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.controler.MyMeetingApiService;
import com.openclassrooms.mareu.model.Meeting;

import java.util.List;




/**
 * A fragment representing a list of Items.
 */
public class MyMeetingsFragment extends Fragment {

    private final MyMeetingApiService service = MyMeetingApiService.newInstance();
    private List<Meeting> meetingsList = service.getMeetingsList();
    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MyMeetingsFragment() {
    }

    @SuppressWarnings("unused")
    public static MyMeetingsFragment newInstance(int columnCount) {
        MyMeetingsFragment fragment = new MyMeetingsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_meetings_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyItemRecyclerViewAdapter(meetingsList));
        }
        return view;
    }
    private void initMeetingsList(){
        meetingsList=service.getMeetingsList();
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

    }
    /**
     *
     */
    @Override
    public void onStop() {
        super.onStop();

    }

}