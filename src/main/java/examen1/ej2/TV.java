package examen1.ej2;

public class TV implements ITV{
    private String opSystem;
    private String version;
    private int resolution;
    private int inches;
    private boolean hasHDMI;
    private int usbPorts;
    private boolean hasRemoteControl;
    private boolean hasBluetooth;
    private Serial serial;

    @Override
    public Object clone() {
        TV clone = new TV();
        clone.setOpSystem(getOpSystem());
        clone.setVersion(getVersion());
        clone.setResolution(getResolution());
        clone.setInches(getInches());
        clone.setHasHDMI(isHasHDMI());
        clone.setUsbPorts(getUsbPorts());
        clone.setHasRemoteControl(isHasRemoteControl());
        clone.setHasBluetooth(isHasBluetooth());
        clone.setSerial(getSerial());
        return clone;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isHasHDMI() {
        return hasHDMI;
    }

    public void setHasHDMI(boolean hasHDMI) {
        this.hasHDMI = hasHDMI;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    public boolean isHasRemoteControl() {
        return hasRemoteControl;
    }

    public void setHasRemoteControl(boolean hasRemoteControl) {
        this.hasRemoteControl = hasRemoteControl;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public Serial getSerial() {
        return serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }
}
