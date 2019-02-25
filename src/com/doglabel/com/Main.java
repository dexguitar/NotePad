package com.doglabel.com;

public class Main {


    public static void main(String[] args) {

        Notepad notepad = new Notepad();

        notepad.addNote("title0", "body0");
        notepad.addNote("title1", "body1");
        notepad.addNote("title2", "body2");
        notepad.addNote("title3", "body3");
        notepad.addNote("title4", "body4");
        notepad.addNote("title5", "body5");
        notepad.addNote("title6", "body6");
        notepad.addNote("title7", "body7");
        notepad.addNote("title8", "body8");
        notepad.addNote("title9", "body9");
        notepad.addNote("title10", "body10");

        System.out.println(notepad.showAllNotes());

        notepad.deleteNote("title1");
        notepad.deleteNote("title2");
        notepad.deleteNote("title3");
        notepad.deleteNote("title4");
        notepad.deleteNote("title5");
        notepad.deleteNote("title6");
        notepad.deleteNote("title7");

        System.out.println(notepad.getNoteLength());

        notepad.addNote("title11", "body11");
        notepad.addNote("title12", "body12");
        notepad.addNote("title13", "body13");

        System.out.println(notepad.showAllNotes());

        System.out.println(notepad.getNoteLength());
    }


}