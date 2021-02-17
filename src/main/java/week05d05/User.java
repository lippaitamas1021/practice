package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (!email.contains("@") || (!email.contains("."))) {
            throw new IllegalArgumentException("Wrong e-mail address");
        }
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        User user = new User("Mila", "Kunis", "mila.kunis@yahoo.com");
        System.out.println(user.getFullName());
        User user2 = new User("Trey", "Parker", "treyparkeryahoo.com");
        System.out.println(user2.getEmail());
    }
}
