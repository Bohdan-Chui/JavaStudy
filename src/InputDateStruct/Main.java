package InputDateStruct;


import InputDateStruct.controller.Controller;
import InputDateStruct.model.Model;
import InputDateStruct.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
