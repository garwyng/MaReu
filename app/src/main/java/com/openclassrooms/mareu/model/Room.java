package com.openclassrooms.mareu.model;

public class Room {
    private String salleName;
    private boolean salleFree;
    private int id;

    public Room(int id , String salleName, boolean salleFree) {
        this.salleName = salleName;
        this.salleFree = salleFree;
        this.id = id;
    }

    public String getSalleName() {
        return salleName;
    }

    public boolean isSalleFree() {
        return salleFree;
    }
}
