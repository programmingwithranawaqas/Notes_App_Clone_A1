package com.example.notesappclonea1;

import java.util.Date;

public class Note {
    private String title, description;
    private Date dateAndTime, reminderDateTime;
    private boolean isFav;

    public Note() {
    }

    public Note(String title, String description, Date dateAndTime, Date reminderDateTime, boolean isFav) {
        this.title = title;
        this.description = description;
        this.dateAndTime = dateAndTime;
        this.reminderDateTime = reminderDateTime;
        this.isFav = isFav;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Date getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(Date reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }
}
