package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

abstract class MyMeetingApiGenerator {
    public static List<Room> getMeetingRooms(){
        return new ArrayList<>(MEETING_ROOMS);}
    private static final List <Room> MEETING_ROOMS = Arrays.asList(
            new Room(1,"Réunion 1",true),
            new Room(2,"Réunion 2",true),
            new Room(3,"Réunion 3",true),
            new Room(4,"Réunion 4",true),
            new Room(5,"Réunion 5",true),
            new Room(6,"Réunion 6",true),
            new Room(7,"Réunion 7",true),
            new Room(8,"Réunion 8",true),
            new Room(9,"Réunion 9",true),
            new Room(10,"Réunion 10",true));
    public static List<Meeting> getMeetings(){return new ArrayList<Meeting>(MEETINGS_LIST);}
    static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy", Locale.ENGLISH);
    public static List<Meeting> MEETINGS_LIST;

    static {
        try {
            MEETINGS_LIST = Arrays.asList(
                    new Meeting(1, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 1",
                            format.parse("23-06-20"),"14h00"),
                    new Meeting(2, "budjet", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 2",
                            format.parse("23-06-20"),"9h00"),
                    new Meeting(3, "campagne achat", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 3",
                            format.parse("23-06-20"),"15h00"),
                    new Meeting(4, "Plan formation", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 4",
                            format.parse("23-06-20"),"9h00"),
                    new Meeting(5, "nouveau projet", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 5",
                            format.parse("23-06-20"),"10h00"),
                    new Meeting(6, "Augmentation", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 6",
                            format.parse("23-06-20"),"11h00"),
                    new Meeting(7, "Présention équipe", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 7",
                            format.parse("23-06-20"),"14h00"),
                    new Meeting(8, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 8",
                            format.parse("23-06-20"),"15h00"),
                    new Meeting(9, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 9",
                            format.parse("23-06-20"),"16h00"),
                    new Meeting(10, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 10",
                            format.parse("23-06-20"),"15h00")
            );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Time> MEETING_HOURS = Arrays.asList(
            new Time(9,0,0),
            new Time(9,15,0),
            new Time(9,30,0),
            new Time(9,45,0),
            new Time(10,0,0),
            new Time(10,15,0),
            new Time(10,30,0),
            new Time(10,45,0),
            new Time(11,0,0),
            new Time(11,15,0),
            new Time(11,30,0),
            new Time(11,45,0),
            new Time(12,0,0),
            new Time(12,15,0),
            new Time(12,30,0),
            new Time(12,45,0),
            new Time(13,0,0),
            new Time(13,15,0),
            new Time(13,30,0),
            new Time(13,45,0),
            new Time(14,0,0),
            new Time(14,15,0),
            new Time(14,30,0),
            new Time(14,45,0),
            new Time(15,0,0),
            new Time(15,15,0),
            new Time(15,30,0),
            new Time(15,45,0),
            new Time(16,0,0),
            new Time(16,15,0),
            new Time(16,30,0),
            new Time(16,45,0),
            new Time(17,0,0),
            new Time(17,15,0),
            new Time(17,30,0),
            new Time(17,45,0),
            new Time(18,0,0)
    );

    public static List<Time> getMeetingHours() {
        return MEETING_HOURS;
    }
    public static List<Time> sTimerList= Arrays.asList(
        new Time(0,15,0),
        new Time(0,30,0),
        new Time(0,45,0),
        new Time(1,0,0)
                );

    public static List<Time> getTimerList() {
        return sTimerList;
    }
}


