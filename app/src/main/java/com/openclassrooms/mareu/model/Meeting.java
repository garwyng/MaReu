package com.openclassrooms.mareu.model;

import java.util.Date;
import java.util.List;

public class Meeting {

    private String subject;
    private List<CoWorker> participants;
    private Room room;
    private Date creationDate;
    private Date reservationDate;

    /**
     *
     * @param subject
     * @param participants
     * @param room
     */
    public Meeting(String subject, List<CoWorker> participants, Room room, Date creationDate, Date reservationDate) {
        this.subject = subject;
        this.participants = participants;
        this.room = room;
        this.creationDate = creationDate;
        this.reservationDate = reservationDate;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<CoWorker> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CoWorker> participants) {
        this.participants = participants;
    }

    public Room getSalle() {
        return room;
    }

    public void setSalle(Room salle) {
        this.room = salle;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
