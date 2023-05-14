package com.openclassrooms.mareu.model;public class CoWorker {
    public String name;
    public String Surname;
    public String mail;
    public String department;

    /**
     * Constructer for CoWorker
     * @param name
     * @param surname
     * @param mail
     * @param department
     */
    public CoWorker(String name, String surname, String mail, String department) {
        this.name = name;
        Surname = surname;
        this.mail = mail;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
