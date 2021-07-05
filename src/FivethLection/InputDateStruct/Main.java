package FivethLection.InputDateStruct;


public class Main { public static void main(String[] args) {
    // Initialization
    Note note = new Note();
    View view = new View();
    Controller controller = new Controller(note, view);
    // Run
    controller.processUser();
    }
}
