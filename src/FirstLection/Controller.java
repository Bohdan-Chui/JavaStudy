package FirstLection;

import java.util.Scanner;

public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setFirstWord(inputWordWithScanner(sc, View.INPUT_FIRST_WORD));
        model.setSecondWord(inputWordWithScanner(sc, View.INPUT_SECOND_WORD));
        view.printMessageAndString(View.OUT_STRING  , model.getSentence());
    }

    // The Utility methods
    public String inputWordWithScanner(Scanner sc, String line) {
        view.printMessage(line);
        while( ! sc.hasNextLine()) {
            view.printMessage(View.WRONG_INPUT + line);
            sc.next();
        }
        return sc.nextLine();
    }
}
