package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        PersonMain personMain = new PersonMain();

        Person person = new Person("Tamás", "000147");

        Address address = new Address("HUN", "Vásárosnamény", "Rákóczi Ferenc utca 68.", "H-4800");

        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Taylor Swift", "758314HA");
        System.out.println(person.personToString());

        person.getAddress().correctData("Magyarország", "Budapest XI. kerület", "Budafoki út 56. 3. emelet", "H-1117");

        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Magyarország", "Miskolc", "Kossuth Lajos utca 1.", "H-3525");

        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());
    }
}
