package examen1.ej4;

public class Client {
    public static void main(String[] args){
        Seller seller = new Seller();
        Buyer buyer = new Buyer();
        ComboMaker comboMaker1 = new NormalComboMaker();
        ComboMaker comboMaker2 = new MediumComboMaker();
        ComboMaker comboMaker3 = new MegaComboMaker();

        seller.setComboMaker(comboMaker1);
        seller.buildCombo();
        comboMaker1.getCombo().showCombo();

        seller.setComboMaker(comboMaker2);
        seller.buildCombo();
        comboMaker2.getCombo().showCombo();

        seller.setComboMaker(comboMaker3);
        seller.buildCombo();
        comboMaker3.getCombo().showCombo();

        buyer.buyCombo(comboMaker1.getCombo());
        buyer.buyCombo(comboMaker2.getCombo());
        buyer.buyCombo(comboMaker3.getCombo());


    }
}
