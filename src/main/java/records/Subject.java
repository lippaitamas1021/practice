package records;

import java.util.Objects;

public class Subject {

    private String nameOfSubject;

    public Subject(String name) {
        this.nameOfSubject = name;
    }

    public String getSubjectName() {
        return nameOfSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(nameOfSubject, subject.nameOfSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSubject);
    }
}
