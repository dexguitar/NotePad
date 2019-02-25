package com.doglabel.com;

public class Note {

    //    PROPERTIES
    private String title;
    private String body;


    //    CONSTRUCTOR
    public Note(String title, String body) {
        this.title = title;
        this.body = body;
    }


    //    GETTERS & SETTERS
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getBody() {
        return body;
    }


    public void setBody(String body) {
        this.body = body;
    }

    //    METHODS
    @Override
    public String toString() {
        return getTitle() + " " + getBody();
    }

}