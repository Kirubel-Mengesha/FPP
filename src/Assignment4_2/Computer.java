package Assignment4_2;
import java.util.Objects;
public class Computer {
    //Instance fields
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    //Constructor
    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    // Getters and Setters

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    //Instance methods
    public double computePower() {
        return (ramSize * processorSpeed);
    }

    @Override
    public String toString() {
        return "Computer{" + "\'" +
                ", manufacturer=" + manufacturer + "\'" +
                ", processor=" + processor + "\'" +
                ", ramSize=" + ramSize + "\'" +
                ",processorSpeed=" + processorSpeed + "\'" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Computer comp = (Computer) obj;
        return (manufacturer.equals(comp.manufacturer) && processor.equals(comp.processor) &&
                (ramSize == comp.ramSize) && (processorSpeed == comp.processorSpeed));
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
