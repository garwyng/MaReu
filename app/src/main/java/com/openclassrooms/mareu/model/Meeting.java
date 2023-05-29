package com.openclassrooms.mareu.model;

import java.util.Date;
import java.util.List;

public class Meeting {
    int id;
    private String subject;
    private String guests;
    private Room room;
    private String roomReseved;
    private String reservationDate;
    private String reservedHour;

    /**
     *
     * @param subject
     * @param guests
     * @param roomReseved
     */
    public Meeting(int id,String subject, String guests, String roomReseved, String reservationDate,String reservedHour) {
        this.subject = subject;
        this.guests = guests;
        this.roomReseved = roomReseved;
        this.reservationDate = reservationDate;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getRoomReseved() {
        return roomReseved;
    }

    public void setRoomReseved(String roomReseved) {
        this.roomReseved = roomReseved;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservedHour() {
        return reservedHour;
    }

    public void setReservedHour(String reservedHour) {
        this.reservedHour = reservedHour;
    }
}
