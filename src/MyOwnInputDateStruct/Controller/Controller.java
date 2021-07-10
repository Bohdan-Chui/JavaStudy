package MyOwnInputDateStruct.Controller;

import MyOwnInputDateStruct.View.View;

import java.util.Scanner;

public class Controller {
    View view;
    Notebook notebook;
    Scanner scanner= new Scanner(System.in);


    public Controller(View view, Notebook notebook) {
        this.view = view;
        this.notebook = notebook;
    }
    public void process() {
        NoteController noteController = new NoteController(scanner, view);
                notebook.addNote("Bohdan", "bohdan1234");
                notebook.addNote(noteController);
                view.print(notebook.toString());



    }
}
