package com.openclassrooms.mareu.model;

public class Room {
    private int id;
    private String roomName;
    private boolean roomFree;

    public Room(int id, String roomName, boolean roomFree) {
        this.id = id;
        this.roomName = roomName;
        this.roomFree = roomFree;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isRoomFree() {
        return roomFree;
    }

    public void setRoomFree(boolean roomFree) {
        this.roomFree = roomFree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


