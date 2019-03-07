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

        notepad.deleteNote("title1");
        notepad.deleteNote("title3");
        notepad.deleteNote("title5");

        System.out.println(notepad.showAllNotes());

    }


}