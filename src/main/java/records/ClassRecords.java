package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = new Random(5);
    }

    public String getClassName() {
        return className;
    }


    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (!s.equals(student)) {
                students.add(student);
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        for (Student s : students) {
            if (!s.equals(student)) {
                return false;
            } else {
                students.remove(student);
            }
        }
        return true;
    }

    public double calculateClassAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.calculateAverage();
        }
        return  sum / students.size();
    }

    public double calculateClassAverageBySubject(Subject geography) {
        return 0.0;
    }

    public String findStudentByName(String name) {
        if (("").equals(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        String nameSearched = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
               nameSearched = name;
            }
        }
        return nameSearched;
    }

    public int repetition() {
        return this.rnd.nextInt(students.size() -1);
    }

    public List<StudyResultByName> listStudyResults() {
        List<String> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).getName();
            list1.add(name);
            double average = students.get(i).calculateAverage();
            list2.add(average);
        }
        return null;
    }

    public List<String> listStudentNames() {
        List<String> names = new ArrayList<>();
        for (Student s : students) {
            names.add(s.getName());
        }
        return names;
    }
}
