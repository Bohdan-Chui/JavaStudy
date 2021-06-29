package SecondLection.JavaPlay;

public class View {

    public static final String INPUT_INT_DATA = "Try to guess ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String NUMBER_WAS_INPUT_BEFORE = "Number was input before, try again ";
    public static final String FINALLY_GUESSED_NUMBER ="Congratulations, right answer!";
    public static final String BEFORE_OUT_ARRAY = "You tries : ";
    public static final String GUESSED_NUMBER = "Guessed number :";
    public static final String NO_ATTEMPS = "Only one attemp was used";


    void printMessage(String message){
        System.out.print(message);
    }
    void printMessage(String message,int number){
        System.out.println(message + number);
    }
    void printMessage(int number){
        System.out.print(number);
    }
    void printMessageln(String message){
        System.out.println(message);
    }

    void printFinalResults(int []array, int number, int counter){
        printMessageln(FINALLY_GUESSED_NUMBER);
        printMessage(GUESSED_NUMBER , number);
        if(counter != 0){
            printMessage(BEFORE_OUT_ARRAY);
            for (int i = 0; i <= counter-1; i++) {
                System.out.print(array[i]);
                System.out.print(' ');
            }
        }else printMessage(NO_ATTEMPS);
    }

}
