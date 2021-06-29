package FirstLection;

public class View {
    // Text's constants
    public static final String INPUT_FIRST_WORD = "Input first word ";
    public static final String INPUT_SECOND_WORD = "Input second word ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String OUT_STRING = "Sentence = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndString(String message, String sentence){
        System.out.println(message + sentence);
    }

}

