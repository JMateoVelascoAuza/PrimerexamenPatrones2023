package examen1.ej4;

public class Combo {
    private String name;
    private String popcorn;
    private String beverages;
    private String chocolates;

    public void showCombo(){
        System.out.println("This "+name+" combo includes: ");
        System.out.println(popcorn);
        System.out.println(beverages);
        System.out.println(chocolates);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopcorn() {
        return popcorn;
    }

    public void setPopcorn(String popcorn) {
        this.popcorn = popcorn;
    }

    public String getBeverages() {
        return beverages;
    }

    public void setBeverages(String beverages) {
        this.beverages = beverages;
    }

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }
}
