package ImmutableAndStudentHM;

public class Car {
    private final String color;
    private final Engine engine;

    public Car(String color, Engine engine) {
        this.color = color;
        Engine tmpEngine = new Engine(engine.getPower(), engine.getName());
        this.engine = tmpEngine;
    }
    public Engine getEngine(){
        return new Engine(engine.getPower(), engine.getName());
    }
    public String getColor(){
        return  new String(color);
    }
    public Car setEngine(Engine e){
        return  new Car(this.color, e);
    }
    public  Car setColor(String c){
        return  new Car(c,this.engine);
    }
}
