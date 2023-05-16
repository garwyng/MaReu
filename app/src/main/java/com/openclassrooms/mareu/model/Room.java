package com.openclassrooms.mareu.model;

public class Room {
    String salleName;
    boolean salleFree;

    public Room(String salleName, boolean salleFree) {
        this.salleName = salleName;
        this.salleFree = salleFree;
    }

    public String getSalleName() {
        return salleName;
    }

    public boolean isSalleFree() {
        return salleFree;
    }
}
