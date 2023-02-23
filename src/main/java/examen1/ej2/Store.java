package examen1.ej2;

public class Store {
    public static void main(String[] args){
        TV tv1 = new TV();
        Serial serial1 = new Serial("1234567890");
        tv1.setSerial(serial1);
        tv1.setOpSystem("Android");
        tv1.setVersion("11.0");
        tv1.setInches(80);
        tv1.setResolution(50);
        tv1.setHasHDMI(true);
        tv1.setUsbPorts(4);
        tv1.setHasRemoteControl(true);
        tv1.setHasBluetooth(true);

        TV tv2 = (TV) tv1.clone();
        Serial serial2 = new Serial("456345655758");
        tv2.setSerial(serial2);

        TV tv3 = (TV) tv1.clone();
        Serial serial3 = new Serial("67868768768");
        tv3.setSerial(serial3);

        TV tv4 = (TV) tv1.clone();
        Serial serial4 = new Serial("453234356780");
        tv4.setSerial(serial4);

        TV tv5 = (TV) tv1.clone();
        Serial serial5 = new Serial("8908766567");
        tv5.setSerial(serial5);

        System.out.println("TV 1 Serial: "+tv1.getSerial().getID()+" & Hashcode: "+tv1.hashCode());
        System.out.println("TV 2 Serial: "+tv2.getSerial().getID()+" & Hashcode: "+tv2.hashCode());
        System.out.println("TV 3 Serial: "+tv3.getSerial().getID()+" & Hashcode: "+tv3.hashCode());
        System.out.println("TV 4 Serial: "+tv4.getSerial().getID()+" & Hashcode: "+tv4.hashCode());
        System.out.println("TV 5 Serial: "+tv5.getSerial().getID()+" & Hashcode: "+tv5.hashCode());

    }
}
