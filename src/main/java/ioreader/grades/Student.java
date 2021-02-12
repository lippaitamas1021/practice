package ioreader.grades;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> gradeList;

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = new ArrayList<>(gradeList);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public double average() {
        double sum = 0;
        for (Integer grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.size();
    }

    public boolean isIncreasing() {
       for (int i = 0; i < gradeList.size(); i++) {
           if (gradeList.get(gradeList.size() - 2) < gradeList.get(gradeList.size() - 1)) {
               return true;
           }
       } return false;
    }
}
