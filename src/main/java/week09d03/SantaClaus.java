package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    private List<Person> persons;

    public SantaClaus(List<Person> persons) {
        this.persons = new ArrayList<>(persons);
    }

    public void getThroughChimneys() {
        for (Person person : persons) {
            person.setPresent();
        }
    }
}
