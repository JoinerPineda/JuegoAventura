package backend.riddles;

public class NumericRiddle extends Riddle{

    private int solution;
    public NumericRiddle(String description, int solution) {
        super(description);
        this.solution = solution;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    @Override
    public boolean solve(String response) {
        try {
            int numericResponse = Integer.parseInt(response);
            if (solution == numericResponse) {
                setSolved(true);
            }
        } catch (NumberFormatException e) {
            System.out.println("La respuesta debe ser un número.");
        }
        return isSolved();
    }
}
