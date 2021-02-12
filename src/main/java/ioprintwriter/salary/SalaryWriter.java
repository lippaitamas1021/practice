package ioprintwriter.salary;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> employees;

    public SalaryWriter(List<String> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String employee : employees) {
                writer.print(employee);
                writer.print(": ");
                writer.println(decideSalary(employee));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private int decideSalary(String employee) {
            if (employee.contains("Dr")) {
                return 500_000;
            } else if (employee.contains("Mr") || employee.contains("Mrs")) {
                return 200_000;
            } else {
                return 100_000;
            }
    }
}
