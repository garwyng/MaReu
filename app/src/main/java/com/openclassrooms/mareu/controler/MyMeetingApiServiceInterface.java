package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.Meeting;

import java.util.List;

public interface MyMeetingApiServiceInterface {
    void deleteMeeting(Meeting meeting);
    List<Meeting> getMeetingsList();

}
