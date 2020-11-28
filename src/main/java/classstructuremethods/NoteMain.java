package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note n = new Note("ToDo List", "ToDo", "learn, shopping");

        System.out.println(n.getNoteText());
    }
}

