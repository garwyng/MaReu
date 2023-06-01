package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static List<Meeting> getMeetings(){return MEETINGS_LIST;}
    public static List<Meeting> MEETINGS_LIST = Arrays.asList(
            new Meeting(1, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 1","24/04/23","14h00"),
            new Meeting(2, "budjet", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 2","02/05/23","9h00"),
            new Meeting(3, "campagne achat", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 3","02/06/23","15h00"),
            new Meeting(4, "Plan formation", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 4","05/06/23","9h00"),
            new Meeting(5, "nouveau projet", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 5","05/06/23","10h00"),
            new Meeting(6, "Augmentation", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 6","05/06/23","11h00"),
            new Meeting(7, "Présention équipe", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 7","05/06/23","14h00"),
            new Meeting(8, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 8","05/06/23","15h00"),
            new Meeting(9, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 9","05/06/23","16h00"),
            new Meeting(10, "Point projet en cours", "antoine@lamazon.fr, bernadette@lamazon.fr, sophie@lamazon.fr","Réunion 10","05/06/23","15h00"));

}


