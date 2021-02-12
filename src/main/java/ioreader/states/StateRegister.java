package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public void readStatesFromFile(String fileName) {
        Path path = Path.of(fileName);
        try {
            BufferedReader br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("-");
                states.add(new State(temp[0], temp[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }


    public String findCapitalByStateName(String stateName) {
        for (State state : states) {
            if (stateName.equals(state.getStateName())) {
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }

    public static void main(String[] args) {
        StateRegister sr = new StateRegister();
        sr.readStatesFromFile("stateregister.txt");
        System.out.println(sr.findCapitalByStateName("Alaska"));
    }
}
