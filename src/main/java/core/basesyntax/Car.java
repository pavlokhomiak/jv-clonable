package core.basesyntax;

public class Car implements Cloneable {
    private int id;
    private int weight;
    private String model;
    private String colour;
    private Engine engine;

    public Car(int id, int weight, String model, String colour, Engine engine) {
        this.id = id;
        this.weight = weight;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = this.clone();
        car.engine = car.engine.clone();
        return car;
    }
}
