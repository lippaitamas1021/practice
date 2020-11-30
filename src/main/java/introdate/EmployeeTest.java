package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Kérem, adja meg a nevét: ");
        employee.setName(scanner.nextLine());

        System.out.println("Kérem, adja meg a születési évét: ");
        employee.setYearOfBirth(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Név: " + employee.getName() + ", szül.év: " + employee.getYearOfBirth() + "., belépés időpontja: " + employee.getBeginEmployment());


    }
}
