package backend;

import backend.riddles.Riddle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdventureGame {

    private Queue<String> events;
    private int actualRiddle;
    private ArrayList<Riddle> riddles;

    public AdventureGame(int actualRiddle, ArrayList<Riddle> riddles, Queue<String> events) {
        this.actualRiddle = actualRiddle;
        this.riddles = riddles;
        this.events = events;
    }

    public boolean play (String response) {
        Riddle riddle = getRiddle();
        boolean isCorrect = riddle.solve(response);
        if (isCorrect) {
            this.actualRiddle++;
        }

        String desc = riddle.getDescription();
        String event = desc;
        event += isCorrect ?  " ACERTADO. "  :  " FALLADO. ";
        event += "Respuesta: " + response;
        events.add(event);
        return isCorrect;
    }

    public Riddle getRiddle () {
        if (hasOver()) return null;

        return riddles.get(actualRiddle);
    }

    public boolean hasOver () {
        return this.actualRiddle == riddles.size();
    }

    public String getEvents () {
        StringBuilder eventsInfo = new StringBuilder();
        int index = 1;
        for (String event : events) {
            eventsInfo.append("Evento ").append(index).append(" - ");
            eventsInfo.append(event);
            eventsInfo.append("\n");
            index++;
        }
        return eventsInfo.toString();
    }
}
