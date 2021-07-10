package MyOwnInputDateStruct.Controller;

import java.util.Objects;

public class Note {
    private String login;
    private String name;

    Note(){

    }
    Note (String name, String login){
        this.login = login;
        this.name = name;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Note{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                "}\n";
    }

    public boolean equalsLogin(Note o) {
        if(login.equals(o.getLogin()))
            return true;
        else return false;
    }


}
