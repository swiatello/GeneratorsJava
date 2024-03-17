package generators;

import java.util.List;
import java.util.Random;

public class RegonGenerator {
    private static final Random RANDOM = new Random();

    public static String generateRegon() {

        String regon = String.valueOf(RANDOM.nextInt(10000000, 90000000));
        int sum = 0;
        List<Integer> listOfFactors = List.of(8, 9, 2, 3, 4, 5, 6, 7);
        for (int i = 0; i < regon.length(); i++) {
            sum += listOfFactors.get(i) * Character.getNumericValue(regon.charAt(i));
        }
        return regon + ((sum % 11) % 10);
    }
}

