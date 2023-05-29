package com.openclassrooms.mareu.model;

public class CoWorker {
    private String mail;
    /**
     * Constructer for CoWorker
     * @param mail
     */
    public CoWorker(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
