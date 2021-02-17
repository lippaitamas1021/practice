package week04d01;

public class NameChanger {

    private String firstName;
    private String lastName;
    private String fullName;

    public NameChanger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    private String changeFirstName(String firstName) {
        this.firstName = firstName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        NameChanger nameChanger = new NameChanger("Mila", "Kunis");
        System.out.println(nameChanger.getFullName());
        System.out.println(nameChanger.changeFirstName("Liza"));
    }
}
