package week07d05;

public class AbstractVehicle {

    private int numberOfGears;
    private TransmissionType transmissionType;

    public AbstractVehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public AbstractVehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = TransmissionType.AUTOMATIC;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }


}
