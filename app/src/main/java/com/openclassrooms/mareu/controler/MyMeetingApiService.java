

package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.R;
import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.util.ArrayList;
import java.util.List;

public class MyMeetingApiService implements MyMeetingApiServiceInterface {

    private List<Room> mRoomsList = MyMeetingApiGenerator.getMeetingRooms();
    private ArrayList<Meeting> mMeetingsList = (ArrayList<Meeting>) MyMeetingApiGenerator.getMeetings();

    public ArrayList<Meeting> getMeetings() {
        if (mMeetingsList == null){
            return mMeetingsList;
        }
    else{
        return new ArrayList<Meeting>();
    }
    }
    public ArrayList<Room> getRoom() {return (ArrayList<Room>) mRoomsList;
    }

    @Override
    public void createReu() {

    }

    @Override
    public void deleteReu() {

    }
}
