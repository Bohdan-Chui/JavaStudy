package MyOwnInputDateStruct.View;

import  MyOwnInputDateStruct.View.TextConstant;

import java.util.Locale;
import java.util.ResourceBundle;

import static MyOwnInputDateStruct.View.TextConstant.INPUT_STRING_DATA;
import static MyOwnInputDateStruct.View.TextConstant.WRONG_INPUT_DATA;

public class View {
    private static final String MESSAGES_BUNDLE_NAME = "messages";
   // public ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua")); //ua version
    public ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("eu"));

    public void printStringInput(String message){
        System.out.println(stringConcat(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message){
        System.out.println(stringConcat(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public  void print(String... arg){
        System.out.println(stringConcat(arg));
    }

    public String stringConcat(String ... args){
        StringBuilder concatString = new StringBuilder();
        for(String v : args) {concatString.append(v);}
        return new String(concatString);

    }

    public ResourceBundle getBundle() {
        return bundle;
    }
}
