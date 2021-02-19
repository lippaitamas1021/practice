package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() == passengers.size()) {
            throw new IllegalArgumentException("The boat is full");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String passengerName) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(passengerName)) {
                return new Passenger(passengerName, passenger.getCruiseClass());
            }
        }
        throw new IllegalArgumentException("Passenger not found");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> ordered = new ArrayList<>();
        for (Passenger passenger : passengers) {
            ordered.add(passenger.getName());
        }
        Collections.sort(ordered);
        return ordered;
    }

    public double sumAllBookingsCharged() {
        int sum = 0;
        for (Passenger passenger : passengers) {
            sum += passenger.getCruiseClass().getMultiplier() * basicPrice;
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        return null;
    }
}
