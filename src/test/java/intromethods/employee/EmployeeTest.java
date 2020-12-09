package intromethods.employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void empTest() {
        Employee employee = new Employee("LT", 2021, 400000);
        Assertions.assertEquals(500000, employee.raiseSalary(100000));
    }
}
