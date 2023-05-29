

package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.util.ArrayList;
import java.util.List;

public class MyMeetingApiService implements MyMeetingApiServiceInterface {

    private List<Room> mRoomsList = MyMeetingApiGenerator.getMeetingRooms();
    private List<Meeting> mMeetingsList = MyMeetingApiGenerator.getMeetings();

    public List<Meeting> getMeetingsList() {
        return mMeetingsList;
    }

    public ArrayList<Room> getRooms() {return (ArrayList<Room>) mRoomsList;
    }

    @Override
    public void createReu() {

    }

    @Override
    public void deleteReu() {

    }
}
