package generators;

import java.util.Random;

public class NumberGenerator {
    private static final Random RANDOM = new Random();

    private int generateNumberInt() {
        return RANDOM.nextInt(Integer.MAX_VALUE) + 1;
    }

    private double generateNumberDouble() {
        return Math.round(RANDOM.nextDouble() * 100.0) / 100.0;
    }

    private int generateNumber(int number) {
        return RANDOM.nextInt(number + 1);
    }

    private double generateNumber(double number) {
        return Math.round(RANDOM.nextDouble(number) * 100.0) / 100.0;
    }

    private int generateNumber(int numberOne, int numberTwo) {
        return RANDOM.nextInt((numberTwo - numberOne) + 1) + numberOne;

    }

    private double generateNumber(double numberOne, double numberTwo) {
        double randomDouble = numberOne + (numberTwo - numberOne) * RANDOM.nextDouble();
        return Math.round(randomDouble * 100.0) / 100.0;

    }

    public String generate(String generatorType) {
        switch (generatorType) {
            case "Integer":
                return String.valueOf(generateNumberInt());
            case "Decimal":
                return String.valueOf(generateNumberDouble());
            default:
                throw new IllegalArgumentException("There is no implementation for this type. Use only: \"Integer\" or \"Decimal\"");
        }
    }

    public String generate(String generatorType, String number) {
        switch (generatorType) {
            case "Integer":
                return String.valueOf(generateNumber(Integer.parseInt(number)));
            case "Decimal":
                return String.valueOf(generateNumber(Double.parseDouble(number)));
            default:
                throw new IllegalArgumentException("There is no implementation for this type. Use only: \"Integer\" or \"Decimal\"");
        }
    }

    public String generate(String generatorType, String numberOne, String numberTwo) {
        switch (generatorType) {
            case "Integer":
                return String.valueOf(generateNumber(Integer.parseInt(numberOne), Integer.parseInt(numberTwo)));
            case "Decimal":
                return String.valueOf(generateNumber(Double.parseDouble(numberOne), Double.parseDouble(numberTwo)));
            default:
                throw new IllegalArgumentException("There is no implementation for this type. Use only: \"Integer\" or \"Decimal\"");
        }
    }
}