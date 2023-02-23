package examen1.ej4;

public class MegaComboMaker extends ComboMaker{

    @Override
    public void chooseName() {
        combo.setName("Mega combo");
    }

    @Override
    public void choosePopcorn() {
        combo.setPopcorn("Extra huge popcorn");
    }

    @Override
    public void chooseBeverages() {
        combo.setBeverages("3 extra huge beverages with unlimited refill");
    }

    @Override
    public void chooseChocolate() {
        combo.setChocolates("2 big chocolates");
    }
}
