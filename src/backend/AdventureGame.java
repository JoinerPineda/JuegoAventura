package backend;

import backend.riddles.Riddle;

import java.util.ArrayList;

public class AdventureGame {
    private int actualRiddle;
    private ArrayList<Riddle> riddles;

    public AdventureGame(int actualRiddle, ArrayList<Riddle> riddles) {
        this.actualRiddle = actualRiddle;
        this.riddles = riddles;
    }

    public boolean play (String response) {
        Riddle riddle = getRiddle();
        boolean isCorrect = riddle.solve(response);
        if (isCorrect) {
            this.actualRiddle++;
        }

        return isCorrect;
    }

    public Riddle getRiddle () {
        if (hasOver()) return null;

        return riddles.get(actualRiddle);
    }

    public boolean hasOver () {
        return this.actualRiddle == riddles.size();
    }
}
