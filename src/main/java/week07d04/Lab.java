package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void complete(LocalDate date) {
        this.completed = true;
        this.completedAt = date;
    }

    public void complete() {
        this.completed = true;
        this.completedAt = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }

    public boolean isTitleLongerThanTwoCharacters() {
        if (2 < title.length()) {
            return true;
        }
        return false;
    }

    public String titleAndCompleted(String signIfCompleted, String signIfNotCompleted) {
        return title + " " + (completed ? signIfCompleted : signIfNotCompleted);
    }
}
