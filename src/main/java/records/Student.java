package records;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (("").equals(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double values = 0.0;
        int piece = 0;
        for (int i = 0; i < marks.size(); i++) {
            values += marks.get(i).getMarkType().getValue();
            piece++;
        }
        return (values / piece);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(marks, student.marks) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks, name);
    }

    @Override
    public String toString() {
        return name + ", marks: ";
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        } else {
            marks.add(mark);
        }
    }

    public double calculateSubjectAverage(Subject subject) {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double result = 0.0;
        int piece = 0;
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i).getSubject() == null) {
                return 0.0;
            }
            if (marks.get(i).getSubject().equals(subject)) {
                result += marks.get(i).getMarkType().getValue();
                piece++;
            }
            }
        if (piece == 0) {
            return 0.0;
        }
        return (result / piece);
        }




    }

