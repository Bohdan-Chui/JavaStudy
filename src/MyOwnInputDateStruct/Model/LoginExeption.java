package MyOwnInputDateStruct.Model;

public class LoginExeption extends Exception{
    private String login;

    public String getLogin() {
        return login;
    }

    public LoginExeption(String message, String login) {
        super(message);
        this.login = login;
    }
}
