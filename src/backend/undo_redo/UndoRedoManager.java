package backend.undo_redo;

import java.util.Stack;

class Action {
    String description;

    Action(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}


public class UndoRedoManager {
    private Stack<Action> undoStack; // Pila de deshacer
    private Stack<Action> redoStack; // Pila de rehacer

    public UndoRedoManager() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Realiza una acción y la añade a la pila de deshacer
    public void doAction(Action action) {
        undoStack.push(action);
        redoStack.clear(); // Limpia la pila de rehacer
    }

    // Deshace la última acción
    public Action undo() {
        if (!undoStack.isEmpty()) {
            Action action = undoStack.pop();
            redoStack.push(action); // Añade a la pila de rehacer
            return action;
        }
        return null; // No hay nada que deshacer
    }

    // Rehace la última acción deshecha
    public Action redo() {
        if (!redoStack.isEmpty()) {
            Action action = redoStack.pop();
            undoStack.push(action); // Añade a la pila de deshacer
            return action;
        }
        return null; // No hay nada que rehacer
    }
}
