package examen1.ej1;

public class Vehicle {
    private int plate;
    private String model;
    private String color;
    private String type;

    public Vehicle(int plate, String model, String color, String type) {
        this.plate = plate;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
