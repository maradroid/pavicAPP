package com.maradroid.pavicapp;

/**
 * Created by mara on 3/20/16.
 */
public class InspiringPerson {

    private String name;
    private String surname;
    private String birthday;
    private String bio;

    public InspiringPerson(String mName, String mSurname, String mBirthday, String mBio) {
        this.name = mName;
        this.surname = mSurname;
        this.birthday = mBirthday;
        this.bio = mBio;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
