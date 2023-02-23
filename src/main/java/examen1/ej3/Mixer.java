package examen1.ej3;

public class Mixer implements IElectronics {
    private String name;
    private String model;
    private String manufacturer;
    private int price;

    public Mixer(int price){
        setPrice(price);
    }

    @Override
    public void showElectronics() {
        System.out.println("This is a "+name);
        System.out.println("Model: "+model);
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Its price: "+price);
        System.out.println();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
