package MyOwnInputDateStruct.Controller;

import MyOwnInputDateStruct.Model.LoginExeption;
import MyOwnInputDateStruct.View.View;
import MyOwnInputDateStruct.View.TextConstant;

import java.util.Locale;
import java.util.Scanner;

public class NoteController {
    Scanner scanner;
    View view;

    NoteController(Scanner scanner, View view){
        this.scanner = scanner;
        this.view = view;
    }

    public Note InputNewNote(){
        Note tmpNote = new Note();
        String regexName =
                view.getBundle().getLocale().equals(new Locale("ua"))?
                        RegexConstants.REGEX_NAME_UKR : RegexConstants.REGEX_NAME_LAT;
        tmpNote.setName(inputStringValueWithScanner(TextConstant.FIRST_NAME,regexName));
        tmpNote.setLogin(inputStringValueWithScanner(TextConstant.LOGIN_DATA, RegexConstants.REGEX_LOGIN));
        return tmpNote;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}
