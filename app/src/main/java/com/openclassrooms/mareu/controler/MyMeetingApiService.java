

package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.util.List;

public class MyMeetingApiService implements MyMeetingApiServiceInterface {


    static MyMeetingApiService myMeetingApiService;

    public static MyMeetingApiService newInstance() {
        if (myMeetingApiService == null) {
            return new MyMeetingApiService();
        } else {
            return myMeetingApiService;
        }
    }

    private static final List<Room> mRoomsList = MyMeetingApiGenerator.getMeetingRooms();
    private static final List<Meeting> mMeetingsList = MyMeetingApiGenerator.getMeetings();

    public List<Meeting> getMeetingsList() {
        return mMeetingsList;
    }

    List<Room> getRooms() {return mRoomsList;
    }


    @Override
    public void deleteMeeting(Meeting meeting) {
        MyMeetingApiService.newInstance().getMeetingsList().remove(meeting);
    }
}
