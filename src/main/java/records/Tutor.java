package records;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String nameOfTutor;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.nameOfTutor = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return nameOfTutor;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (int i = 0; i < taughtSubjects.size(); i++) {
            if (taughtSubjects.get(i).equals(subject)) {
                return true;
            }
        }
        return false;
    }
}
