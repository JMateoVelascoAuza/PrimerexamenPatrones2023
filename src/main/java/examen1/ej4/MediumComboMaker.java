package examen1.ej4;

public class MediumComboMaker extends ComboMaker{
    @Override
    public void chooseName() {
        combo.setName("Medium combo");
    }

    @Override
    public void choosePopcorn() {
        combo.setPopcorn("Big popcorn");
    }

    @Override
    public void chooseBeverages() {
        combo.setBeverages("2 beverages");
    }

    @Override
    public void chooseChocolate() {
        combo.setChocolates("1 chocolate");
    }
}
