package com.openclassrooms.mareu.model;

import java.util.ArrayList;

public class SalleReu {
    String salleName;
    String salleLocation;
    boolean salleFree;

    public SalleReu(String salleName, String salleLocation, boolean salleFree) {
        this.salleName = salleName;
        this.salleLocation = salleLocation;
        this.salleFree = salleFree;
    }

    public String getSalleName() {
        return salleName;
    }

    public String getSalleLocation() {
        return salleLocation;
    }

    public boolean isSalleFree() {
        return salleFree;
    }
}
