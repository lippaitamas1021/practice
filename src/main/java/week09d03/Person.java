package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.present = getPresent();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
        Random random = new Random();
        if (age < 14) {
            present = Present.values()[random.nextInt(Present.values().length)];
        } else {
            present = Present.values()[random.nextInt(Present.values().length - 1) + 1];
        }
    }
}
