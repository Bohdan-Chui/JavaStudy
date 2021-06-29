package SecondLection.JavaPlay;

public class Model {

    int randomInt, tryCounter;
    int [] inputIntFromUser = new int[5];

    Model(int number){
        this.randomInt = number;
        tryCounter = 0;

    }

    void setInputIntFromUser(int number){
        inputIntFromUser[tryCounter] = number;
        tryCounter++;
    }
    int [] getInputIntFromUser(){
        return inputIntFromUser;
    }

    boolean randomIntCompare(int number){
        return (number == randomInt) ? true : false;
    }

    boolean wasNumberInputBefore(int number){
        boolean flag = false;
        for (int i = 0; i <= tryCounter - 1; i++) {
            if (inputIntFromUser[i] == number){
                flag = true;
            }
        }
        return flag;
    }

    int getRandomInt(){ return  this.randomInt; }
    int getTryCounter(){return this.tryCounter;}
}
