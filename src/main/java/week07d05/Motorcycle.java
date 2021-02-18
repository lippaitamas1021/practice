package week07d05;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }

    public Motorcycle(int numberOfGears) {
        super(numberOfGears);
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.SEQUENTIAL;
    }
}
