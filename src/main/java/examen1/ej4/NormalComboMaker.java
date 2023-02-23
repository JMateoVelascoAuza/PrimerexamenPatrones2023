package examen1.ej4;

public class NormalComboMaker extends ComboMaker{
    @Override
    public void chooseName() {
        combo.setName("Normal combo");
    }

    @Override
    public void choosePopcorn() {
        combo.setPopcorn("Normal size popcorn");
    }

    @Override
    public void chooseBeverages() {
        combo.setBeverages("1 beverage");
    }

    @Override
    public void chooseChocolate() {
        combo.setChocolates("No chocolates");
    }
}
