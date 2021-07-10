package MyOwnInputDateStruct.Controller;

import MyOwnInputDateStruct.Model.LoginExeption;

import java.util.ArrayList;

public class Notebook {
    private ArrayList <Note> notebook = new ArrayList<Note>();

    public void addNote(NoteController noteController){
        Note note;
        while (true){
            try {
                note = noteController.InputNewNote();
                isAlreadyIn(note);
                break;
            }catch (LoginExeption e){
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLogin());
            }
        }
        notebook.add(note);
    }
    public void addNote(String name, String login){
        notebook.add(new Note(name,login));
    }

    public void isAlreadyIn(Note note)throws LoginExeption {
        for (Note tmpNote:notebook) {
            if(tmpNote.equalsLogin(note)) throw new LoginExeption("Not unique logan", note.getLogin());
        }
        return;
    }
    @Override
    public String toString() {
        StringBuilder strConcat = new StringBuilder();
        for (Note note:notebook) {

            strConcat.append(note.toString());

        }
        //strConcat.append('n');
        return new String(strConcat);
    }


}
