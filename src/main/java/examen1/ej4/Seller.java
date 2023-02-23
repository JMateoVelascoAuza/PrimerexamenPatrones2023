package examen1.ej4;

public class Seller {
    private ComboMaker comboMaker;

    public void setComboMaker(ComboMaker comboMaker){
        this.comboMaker = comboMaker;
    }

    public void buildCombo(){
        comboMaker.createCombo();
        comboMaker.chooseName();
        comboMaker.choosePopcorn();
        comboMaker.chooseBeverages();
        comboMaker.chooseChocolate();
    }
}
