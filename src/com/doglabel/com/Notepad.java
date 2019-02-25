package com.doglabel.com;

import java.util.Arrays;

public class Notepad {

    private static final int INIT_NOTEPAD_SIZE = 5;
    public static int counter = 0;

    //    PROPERTIES
    private Note[] notes;


    //    CONSTRUCTOR
    public Notepad() {
        this.notes = new Note[INIT_NOTEPAD_SIZE];
    }


    //    METHODS
    public String getNote(String title) {
        Note newNote = null;

        if (null == title) {
            return "No such note";
        } else {
            for (Note note: notes) {
                if (note.getTitle() == title) {
                    newNote = note;
                    break;
                }
            }
        }

        return newNote.toString();
    }


    public void addNote(String title, String body) {
        Note newNote = new Note(title, body);
        Note[] newNoteArr = new Note[this.notes.length * 2];
        if (null != this.notes[this.notes.length - 1]) {
//            Expanding the notes array if the last element is NOT null
            System.arraycopy(this.notes, 0, newNoteArr, 0, this.notes.length);
            newNoteArr[newNoteArr.length / 2] = newNote;
//            Setting the counter to match the new array
            counter = (newNoteArr.length / 2) + 1;
            this.notes = newNoteArr;
        } else {
            this.notes[counter] = newNote;
            counter++;
        }
    }


    public void deleteNote(String title) {
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i].getTitle() == title) {
                this.notes[i] = null;
//    Shifting elements to the left
                for (int j = i; j < notes.length - 1; j++) {
                    notes[j] = notes[j + 1];
                }
                break;
            }
        }

//    Shrinking the notes array if the last 2 element are null
        Note[] newNoteArr = new Note[this.notes.length / 2];
        if (null == this.notes[(this.notes.length / 4) + 1]) {
            System.arraycopy(this.notes, 0, newNoteArr, 0, this.notes.length / 2);
            this.notes = newNoteArr;
        }

//        Decrement the counter
        counter--;
    }


    public void editNote(String title, String body) {
        Note newNote = null;
//        Search note by title
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getTitle() == title) {
                newNote = notes[i];
                break;
            }
        }
//        Set new body for note
        newNote.setBody(body);
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