package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e = new Employee("LT", 2021, 400000);

        System.out.println(e.toString());

        e.raiseSalary(100000);
        System.out.println(e.getSalary());

    }
}
