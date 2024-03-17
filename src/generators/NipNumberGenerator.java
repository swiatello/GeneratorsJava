package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NipNumberGenerator {
    private static final Random RANDOM = new Random();
    public String generateNip() {
        StringBuilder nipNumber = new StringBuilder();
        List<Integer> weights = List.of(6, 5, 7, 2, 3, 4, 5, 6, 7);
        List<Integer> nipNumberTemplate = generateNipNumberTemplate();

        int countControlNumber = calculateControlNumber(weights, nipNumberTemplate);

        nipNumberTemplate.forEach(nipNumber::append);
        nipNumber.append(countControlNumber);
        return nipNumber.toString();
    }

    private List<Integer> generateNipNumberTemplate() {
        List<Integer> nipNumberTemplate = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            nipNumberTemplate.add(i == 0 ? RANDOM.nextInt(9) + 1 : RANDOM.nextInt(10));
        }
        return nipNumberTemplate;
    }

    private int calculateControlNumber(List<Integer> weights, List<Integer> nipNumberTemplate) {
        int countControlNumber = 0;
        for (int i = 0; i < weights.size(); i++) {
            countControlNumber += weights.get(i) * nipNumberTemplate.get(i);
        }
        return countControlNumber % 11;
    }

//    =============== version 2 ================
    //    private String generateNip() {
//        StringBuilder nipNumber = new StringBuilder();
//        List<Integer> weights = Arrays.asList(6, 5, 7, 2, 3, 4, 5, 6, 7);
//        List<Integer> nipNumberTemplate = Arrays.asList(RANDOM.nextInt(1, 0),
//                RANDOM.nextInt(1, 9),
//                RANDOM.nextInt(1, 8),
//                RANDOM.nextInt(0, 9),
//                RANDOM.nextInt(0, 9),
//                RANDOM.nextInt(0, 9),
//                RANDOM.nextInt(0, 9),
//                RANDOM.nextInt(0, 9),
//                RANDOM.nextInt(0, 9));
//
//        int countControlNumber = 0;
//        int item = 0;
//        for (Integer weight : weights) {
//            countControlNumber = countControlNumber + weight + nipNumberTemplate.get(item);
//            item++;
//        }
//        for (Integer nipElement : nipNumberTemplate) {
//            nipNumber.append(nipElement);
//        }
//        nipNumber.append(countControlNumber);
//        return nipNumber.toString();
//    }
}
