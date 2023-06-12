

package com.openclassrooms.mareu.controler;

import android.util.Log;

import com.openclassrooms.mareu.di.DI;
import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    public String getStringCurrentDate(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        String dateString = DateFormat.getDateInstance().format(cal.getTime());
        return dateString;
    }
    public List<Meeting> DateFilter(Date date) {
         List<Meeting> meetingOfTheDay = new ArrayList<Meeting>();
        for (Meeting meeting:mMeetingsList
        ) {if (meeting.getReservationDate() == date ){
            meetingOfTheDay.add(meeting);
        }
        } mMeetingsList=meetingOfTheDay;
        return mMeetingsList;
    }
}
