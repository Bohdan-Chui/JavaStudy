package FivethLection.InputDateStruct;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    // Constructor
    private final Note note;
    private final View view;

    public Controller(Note note, View view) {
        this.note  = note;
        this.view = view;
    }


    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(view.INPUT_NAME);
        note.setName(chekValidation(sc, GlobalConstants.NAME));

        view.printMessage(view.INPUT_SURNAME);
        note.setName(chekValidation(sc, GlobalConstants.SURNAME));

        view.printMessage(view.INPUT_SECOND_NAME);
        note.setName(chekValidation(sc, GlobalConstants.SECOND_NAME));

        view.printMessage(view.EMAIL);
        note.setName(chekValidation(sc, GlobalConstants.EMAIL));

    }

    /**
     *
     *
     * @param sc actual scanner
     * @param regex from GlobalConstants
     * @return validated word
     */
    public String chekValidation(Scanner sc, String regex){
        String word= sc.nextLine();;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        if(matcher.find()){
            return word;
        }else{
            view.printMessage(view.WRONG_INPUT);
            return chekValidation(sc,regex);
        }
    }
}
