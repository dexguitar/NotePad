package com.doglabel.com;

public class Note {

    //    PROPERTIES
    private int id;
    private String title;
    private String body;


    //    CONSTRUCTOR
    public Note(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }


    //    GETTERS & SETTERS
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


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
        return this.getTitle() + " " + this.getBody();
    }

}