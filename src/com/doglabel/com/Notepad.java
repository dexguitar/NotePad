package com.doglabel.com;

import java.util.Arrays;

public class Notepad {

    private static final int INIT_NOTEPAD_SIZE = 5;
    public int counter;

    //    PROPERTIES
    private Note[] notes;


    //    CONSTRUCTOR
    public Notepad() {
        this.notes = new Note[INIT_NOTEPAD_SIZE];
    }


    //    METHODS
    public String getNote(String title) {

        for (Note n: notes) {
            if (n.getTitle().equals(title)) {
                Note foundNote = new Note(n.getTitle(), n.getBody());
                return foundNote.toString();
            }
        }

        return null;
    }


    public void addNote(String title, String body) {
        Note newNote = new Note(title, body);

//        Is the last element NOT null?
        if (null != this.notes[this.notes.length - 1]) {

//            Expanding the notes array if the last element is NOT null
            Note[] newNoteArr = new Note[this.notes.length * 2];
            System.arraycopy(this.notes, 0, newNoteArr, 0, this.notes.length);

//            Setting the counter to match the new array
            counter = (newNoteArr.length / 2);
            this.notes = newNoteArr;

        }

        this.notes[counter] = newNote;
        counter++;
    }


    public void deleteNote(String title) {
        for (int i = 0; i < notes.length; i++) {
            if (null == notes[i]) {
                continue;
            } else if (notes[i].getTitle().equals(title)) {
                notes[i] = null;
                for (int j = i; j < notes.length - 1; j++) {
                    notes[j] = notes[j + 1];
                    notes[j + 1] = null;
                }
                break;
            }
        }

//        Shrink the array in 1/4 if the half is empty
        if (null == notes[notes.length / 2]) {
            Note[] newArr = new Note[notes.length * 3 / 4];
            System.arraycopy(notes, 0, newArr, 0, notes.length / 2);
            notes = newArr;
        }

//        Decrement the counter
        counter--;
    }


    public void editNote(String title, String body) {
        Note existingNote = null;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getTitle().equals(title)) {
                existingNote = notes[i];
                break;
            }
        }

        existingNote.setBody(body);
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

    }


    public int getNoteLength() {
        return this.notes.length;
    }

}