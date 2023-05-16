

package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.CoWorker;
import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.util.ArrayList;
import java.util.List;

public abstract class MaReuApiService implements MaReuApiServiceInterface {

    private final List<Room> mRoomsList = MaReuRoomApiGenerator.getMeetingRooms();
    private ArrayList<Meeting> mMeetingArrayList = new ArrayList<>();
}
