

package com.openclassrooms.mareu.controler;

import android.util.Log;

import com.openclassrooms.mareu.di.DI;
import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.util.List;

public class MyMeetingApiService implements MyMeetingApiServiceInterface {


    private static List<Room> mRoomsList = MyMeetingApiGenerator.getMeetingRooms();
    private static List<Meeting> mMeetingsList = MyMeetingApiGenerator.getMeetings();

    public List<Meeting> getMeetingsList() {
        return mMeetingsList;
    }

    public List<Room> getRooms() {return mRoomsList;
    }


    @Override
    public void deleteMeeting(Meeting meeting) {
        Log.d("MEETINGSLIST", "deleteMeeting: "+ mMeetingsList);
        DI.getMyMeetingApiService().getMeetingsList().remove(meeting);
        Log.d("MEETINGSLIST", "deleteMeeting: "+ mMeetingsList);
    }
}
