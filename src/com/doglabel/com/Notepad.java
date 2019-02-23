package com.doglabel.com;

import java.util.Arrays;

public class Notepad {

    //    PROPERTIES
    private Note[] notes = new Note[5];


    //    CONSTRUCTOR
    public Notepad() {
        this.notes = notes;
    }


    //    METHODS
    public String getNote(int id) {
        return this.notes[id].getTitle() + " - " + this.notes[id].getBody();
    }


    public void addNote(int id, String title, String body) {
        Note newNote = new Note(id, title, body);
//    Is the last element null?
        if (null == this.notes[this.notes.length - 1]) {
            this.notes[id] = newNote;
//    Expanding the notes array if the last element is NOT null
        } else {
            this.notes = Arrays.copyOf(this.notes, this.notes.length + 3);
            this.notes[id] = newNote;
        }
    }


    public void deleteNote(int id) {
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] == this.notes[id]) {
//    Shifting elements to the left
                for (int j = i; j < notes.length - 1; j++) notes[j] = notes[j + 1];
                break;
            }
        }

//    Shrinking the notes array if the last 2 elements are null
        if (null == this.notes[this.notes.length - 1] && null == this.notes[this.notes.length - 2]) {
            this.notes = Arrays.copyOf(this.notes, this.notes.length - 2);
        }
    }


    public void editNote(int id, String title, String body) {
        Note note = this.notes[id];
        note.setTitle(title);
        note.setBody(body);
    }


    public StringBuilder showAllNotes() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.notes.length; i++) {
            if (null == this.notes[i]) {
                sb.append("Empty note");
                sb.append("\n");
                continue;
            }
            sb.append(this.notes[i]);
            sb.append("\n");
        }

        return sb;

// !!! Remove the stringbuilder if using toString() !!!

//        String newStr = "";
//
//        for (Note note: this.notes) {
//            if (null == note) { break; }
//            newStr += note.toString();
//            newStr += "\n";
//        }
//
//        return newStr;

    }


    public int getNoteLength() {
        return this.notes.length;
    }

}