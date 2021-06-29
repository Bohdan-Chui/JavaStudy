package SecondLection.JavaPlay;

import java.util.Random;
import java.util.Scanner;

public class Controller {

    public static int BOUND = 5;
    Model model;
    View view;
    boolean flag;
    int tempValue;

    Controller(){
        this.model = new Model(this.rand());
        this.view = new View();
        flag = true;
    }

    int rand(){
        Random random = new Random();
        return random.nextInt(BOUND);

    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public void processUsers(){
        Scanner scanner = new Scanner(System.in);

        do{
            tempValue = inputIntValueWithScanner(scanner);
             if(!model.wasNumberInputBefore(tempValue)){
                 if(model.randomIntCompare(tempValue)){
                     flag = false;
                 }else{
                     model.setInputIntFromUser(tempValue);
                 }
             }else{
                 view.printMessage(view.NUMBER_WAS_INPUT_BEFORE);
             }

        }while(flag);

            view.printFinalResults(model.getInputIntFromUser(), model.getRandomInt(), model.getTryCounter());
    }

}
