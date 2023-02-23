package examen1.ej4;

public abstract class ComboMaker {
    protected Combo combo;

    public void createCombo(){
        combo = new Combo();
    }

    public Combo getCombo() {
        return combo;
    }

    public abstract void chooseName();
    public abstract void choosePopcorn();
    public abstract void chooseBeverages();
    public abstract void chooseChocolate();

}
