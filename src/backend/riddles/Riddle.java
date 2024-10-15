package backend.riddles;

public abstract class Riddle {
    protected String description;
    protected boolean isSolved = false;

    public Riddle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public abstract boolean solve(String response);
}
