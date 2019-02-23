package com.doglabel.com;

public class Main {


    public static void main(String[] args) {

        Notepad notepad = new Notepad();

        notepad.addNote(0, "title0", "body0");
        notepad.addNote(1, "title1", "body1");
        notepad.addNote(2, "title2", "body2");
        notepad.addNote(3, "title3", "body3");
        notepad.addNote(4, "title4", "body5");
        notepad.addNote(5, "title5", "body5");

        System.out.println(notepad.showAllNotes());

        System.out.println(notepad.getNoteLength());

        notepad.deleteNote(3);

        System.out.println(notepad.getNoteLength());

        System.out.println(notepad.getNote(2));
    }


}