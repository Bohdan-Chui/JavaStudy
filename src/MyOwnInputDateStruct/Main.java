package MyOwnInputDateStruct;

import MyOwnInputDateStruct.View.View;
import MyOwnInputDateStruct.Controller.Controller;
import MyOwnInputDateStruct.Controller.Notebook;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new Notebook());
        controller.process();
    }
}
