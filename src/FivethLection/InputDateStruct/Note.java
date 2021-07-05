package FivethLection.InputDateStruct;

import com.intellij.remoteServer.runtime.deployment.ServerRuntimeInstance;

public class Note {
    private String name;
    private String surname;
    private String secondName;
    private String email;

    Note(){
        name = null;
        surname = null;
        secondName = null;
        email = null;
    }
//    public String getUser(){
//        String user= null;
//        if(this.name != null){
//            user =new String(user + "Name "+ this.name + " \n");
//        }
//        if(this.surname != null){
//            user =new String(user + "Surname"+this.surname + " \n");
//        }
//        if(this.secondName != null){
//            user =new String(user + "Second name" + this.secondName + " \n");
//        }
//        if(this.email != null){
//            user =new String(user + "Email" + this.email + " \n");
//        }
//
//        if(!user.equals(null))
//            return user;
//        else return "empty user";
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
