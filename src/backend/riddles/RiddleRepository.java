package backend.riddles;

import java.util.ArrayList;
import java.util.Random;

public class RiddleRepository {
    private ArrayList<NumericRiddle> basicNumericRiddles;
    private ArrayList<NumericRiddle> difficultNumericRiddles;
    public RiddleRepository() {
        basicNumericRiddles = new ArrayList<>();
        difficultNumericRiddles = new ArrayList<>();
        generateBasicNumericRiddles();
        generateDifficultNumericRiddles();
    }

    private void generateBasicNumericRiddles () {
        basicNumericRiddles.add(new NumericRiddle("El doble de un número es 20. ¿Cuál es el número?", 10));
        basicNumericRiddles.add(new NumericRiddle("Si sumas 5 a un número, obtienes 12. ¿Cuál es el número?", 7));
        basicNumericRiddles.add(new NumericRiddle("Tengo un número, lo multiplico por 3 y obtengo 18. ¿Qué número es?", 6));
        basicNumericRiddles.add(new NumericRiddle("El triple de un número es 24. ¿Cuál es el número?", 8));
        basicNumericRiddles.add(new NumericRiddle("¿Qué número más 8 es igual a 15?", 7));
        basicNumericRiddles.add(new NumericRiddle("Si restas 4 a un número, obtienes 9. ¿Cuál es el número?", 13));
        basicNumericRiddles.add(new NumericRiddle("Un número dividido entre 4 es igual a 5. ¿Cuál es el número?", 20));
        basicNumericRiddles.add(new NumericRiddle("Tengo un número, lo sumo con 6 y obtengo 10. ¿Qué número es?", 4));
        basicNumericRiddles.add(new NumericRiddle("Si duplico un número y le resto 2, obtengo 8. ¿Qué número es?", 5));
        basicNumericRiddles.add(new NumericRiddle("La mitad de un número es 7. ¿Cuál es el número?", 14));
        basicNumericRiddles.add(new NumericRiddle("Si sumas 9 a un número, obtienes 20. ¿Cuál es el número?", 11));
        basicNumericRiddles.add(new NumericRiddle("Multiplico un número por 6 y obtengo 36. ¿Qué número es?", 6));
        basicNumericRiddles.add(new NumericRiddle("Si resto 3 a un número, obtengo 7. ¿Cuál es el número?", 10));
        basicNumericRiddles.add(new NumericRiddle("Un número más 10 es igual a 18. ¿Cuál es el número?", 8));
        basicNumericRiddles.add(new NumericRiddle("El doble de un número menos 5 es igual a 15. ¿Cuál es el número?", 10));
        basicNumericRiddles.add(new NumericRiddle("Si un número dividido entre 2 es 9, ¿cuál es el número?", 18));
        basicNumericRiddles.add(new NumericRiddle("Tengo un número, lo multiplico por 4 y obtengo 40. ¿Qué número es?", 10));
        basicNumericRiddles.add(new NumericRiddle("Si restas 6 a un número, obtienes 3. ¿Cuál es el número?", 9));
        basicNumericRiddles.add(new NumericRiddle("El triple de un número menos 4 es igual a 17. ¿Cuál es el número?", 7));
        basicNumericRiddles.add(new NumericRiddle("Si duplico un número y le sumo 1, obtengo 17. ¿Qué número es?", 8));
    }

    public void generateDifficultNumericRiddles () {
        difficultNumericRiddles.add(new NumericRiddle("Si sumas el doble de un número con el número mismo, obtienes 45. ¿Cuál es el número?", 15));
        difficultNumericRiddles.add(new NumericRiddle("Un número multiplicado por 5, luego dividido entre 2, y finalmente sumado con 7, da como resultado 32. ¿Qué número es?", 10));
        difficultNumericRiddles.add(new NumericRiddle("La suma de tres números consecutivos es 63. ¿Cuáles son los números?", 20)); // Los números son 20, 21 y 22
        difficultNumericRiddles.add(new NumericRiddle("El doble de un número menos 15 es igual a la mitad del mismo número más 5. ¿Cuál es el número?", 10));
        difficultNumericRiddles.add(new NumericRiddle("Multiplico un número por 3, le resto 9 y obtengo el doble del mismo número más 6. ¿Cuál es el número?", 15));
        difficultNumericRiddles.add(new NumericRiddle("Si un número multiplicado por 4 es igual al mismo número más 30, ¿cuál es el número?", 10));
        difficultNumericRiddles.add(new NumericRiddle("La suma de un número con su doble es 72. ¿Cuál es el número?", 24));
        difficultNumericRiddles.add(new NumericRiddle("Un número dividido entre 3 y luego sumado con 18 es igual a 27. ¿Cuál es el número?", 27));
        difficultNumericRiddles.add(new NumericRiddle("Si el cuadrado de un número menos 20 es igual al doble del número más 25, ¿qué número es?", 10));
        difficultNumericRiddles.add(new NumericRiddle("El triple de un número, sumado con su mitad, es igual a 90. ¿Cuál es el número?", 24));
    }

    public ArrayList<NumericRiddle> getNumericRiddles(ArrayList<NumericRiddle> riddles, int quantity) {
        ArrayList<NumericRiddle> selectedRiddles = new ArrayList<>();
        Random random = new Random();

        if (quantity > riddles.size()) {
            quantity = riddles.size();
        }

        ArrayList<NumericRiddle> riddlesCopy = new ArrayList<>(riddles);
        for (int i = 0; i < quantity; i++) {
            int randomIndex = random.nextInt(riddlesCopy.size());
            selectedRiddles.add(riddlesCopy.get(randomIndex));
            riddlesCopy.remove(randomIndex);
        }

        return selectedRiddles;
    }


    public ArrayList<NumericRiddle> getDifficultNumericRiddles(int quantity) {
        return getNumericRiddles(difficultNumericRiddles, quantity);
    }

    public ArrayList<NumericRiddle> getBasicNumericRiddles(int quantity) {
        return getNumericRiddles(basicNumericRiddles, quantity);
    }

}
