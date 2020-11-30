package introdate;

import java.time.LocalDateTime;

public class Employee {

    private String name;
    private int yearOfBirth;
    private LocalDateTime beginEmployment;

    public Employee() {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.beginEmployment = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
