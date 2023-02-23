package examen1.ej3;

public class FactoryElectronics {
    public static IElectronics make(int electronic){
        IElectronics ie;
        ElectronicsList electronicPos = ElectronicsList.values()[electronic];
        switch (electronicPos) {
            case TV -> ie = new TV(2000);
            case Radio -> ie = new Radio(550);
            case Mixer -> ie = new Mixer(340);
            case Fridge -> ie = new Fridge(1560);
            default -> ie = new Microwave(1600);
        }
        return ie;
    }
}
