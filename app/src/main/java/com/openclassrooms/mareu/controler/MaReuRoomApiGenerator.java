package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaReuRoomApiGenerator {
    static List<Room> getMeetingRooms(){return new ArrayList<>(MEETING_ROOMS);}
    static List <Room> MEETING_ROOMS = Arrays.asList(
            new Room("Réunion 1",true),
            new Room("Réunion 2",true),
            new Room("Réunion 3",true),
            new Room("Réunion 4",true),
            new Room("Réunion 5",true),
            new Room("Réunion 6",true),
            new Room("Réunion 7",true),
            new Room("Réunion 8",true),
            new Room("Réunion 9",true),
            new Room("Réunion 10",true));
}


