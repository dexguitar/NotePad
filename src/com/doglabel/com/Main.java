package com.doglabel.com;

public class Main {


    public static void main(String[] args) {

//        Create a notepad
        Notepad notepad = new Notepad();

//        Add 15 notes
        for (int i = 0; i < 10; i++) {
            notepad.addNote("title" + i, "body" + i);
        }

        System.out.println(notepad.showAllNotes());

        notepad.deleteNote("title0");
        notepad.deleteNote("title3");
        notepad.deleteNote("title9");

        notepad.addNote("title12", "body12");
        notepad.addNote("title13", "body13");

        notepad.addNote("title14", "body14");
        notepad.addNote("title15", "body15");

        notepad.deleteNote("title13");
        System.out.println(notepad.getNote("title1"));
        System.out.println("\n");
//        notepad.deleteNote("title8");

        System.out.println(notepad.showAllNotes());

    }


}