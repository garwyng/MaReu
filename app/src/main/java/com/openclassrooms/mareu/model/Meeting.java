package com.openclassrooms.mareu.model;

import java.util.List;

public class Meeting {

    public String heure;
    public String subject;
    public List<CoWorker> participants;
    public SalleReu salle;

    /**
     *
     * @param heure
     * @param subject
     * @param participants
     * @param salle
     */
    public Meeting(String heure, String subject, List<CoWorker> participants, SalleReu salle) {
        this.heure = heure;
        this.subject = subject;
        this.participants = participants;
        this.salle = salle;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
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

    public SalleReu getSalle() {
        return salle;
    }

    public void setSalle(SalleReu salle) {
        this.salle = salle;
    }
}
