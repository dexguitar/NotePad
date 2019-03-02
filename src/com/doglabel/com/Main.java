package com.doglabel.com;

public class Main {


    public static void main(String[] args) {

//        Create a notepad
        Notepad notepad = new Notepad();

//        Add 15 notes
        for (int i = 0; i < 5; i++) {
            notepad.addNote("title" + i, "body" + i);
        }

        System.out.println(notepad.showAllNotes());

        notepad.deleteNote("title3");

        System.out.println(notepad.showAllNotes());

        notepad.editNote("title2", "body222");

        System.out.println(notepad.showAllNotes());

    }


}