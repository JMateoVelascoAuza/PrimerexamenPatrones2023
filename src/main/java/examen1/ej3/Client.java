package examen1.ej3;

public class Client {
    public static void main(String[] args){
        TV e1 = (TV) FactoryElectronics.make(0);
        Radio e2 = (Radio) FactoryElectronics.make(1);
        Mixer e3 = (Mixer) FactoryElectronics.make(2);
        Fridge e4 = (Fridge) FactoryElectronics.make(3);
        Microwave e5 = (Microwave) FactoryElectronics.make(4);

        e1.showElectronics();
        e2.showElectronics();
        e3.showElectronics();
        e4.showElectronics();
        e5.showElectronics();

    }
}
