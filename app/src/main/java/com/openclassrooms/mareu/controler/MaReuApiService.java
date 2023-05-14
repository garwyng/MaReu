

package com.openclassrooms.mareu.controler;

import com.openclassrooms.mareu.model.CoWorker;
import com.openclassrooms.mareu.model.Meeting;
import com.openclassrooms.mareu.model.SalleReu;

import java.util.List;

public abstract class MaReuApiService implements MaReuApiServiceInterface {
    private SalleReu salle;
    private  Meeting maReu;
    private  List<CoWorker> participants;

    public SalleReu getSalle() {
        return salle;
    }

    public void setSalle(SalleReu salle) {
        this.salle = salle;
    }

    public Meeting getMaReu() {
        return maReu;
    }

    public void setMaReu(Meeting maReu) {
        this.maReu = maReu;
    }

    public List<CoWorker> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CoWorker> participants) {
        this.participants = participants;
    }
}
