package week13d03;

public class Subject {

    private String nameOfTeacher;
    private String nameOfSubject;
    String className;
    private int numberOfLessons;

    public Subject(String nameOfTeacher, String nameOfSubject, String className, int numberOfLessons) {
        this.nameOfTeacher = nameOfTeacher;
        this.nameOfSubject = nameOfSubject;
        this.className = className;
        this.numberOfLessons = numberOfLessons;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public String getClassName() {
        return className;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }
}
