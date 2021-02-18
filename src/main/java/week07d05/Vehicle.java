package week07d05;

public class Vehicle extends AbstractVehicle {

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.MANUAL;
    }
}
