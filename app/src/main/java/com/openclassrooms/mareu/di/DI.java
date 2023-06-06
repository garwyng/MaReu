package com.openclassrooms.mareu.di;

import com.openclassrooms.mareu.controler.MyMeetingApiService;

public class DI {
    private static final MyMeetingApiService mMyMeetingApiService = new MyMeetingApiService();
    public static MyMeetingApiService getMyMeetingApiService(){
        return mMyMeetingApiService;
    }
    public static MyMeetingApiService getNewInstanceMyMeetingApiService(){
       return new MyMeetingApiService();
    }
}
