package generators;

public class Main {
    public static void main(String[] args) {
        // *** LastDayOfMonthGenerator ***
        LastDayOfMonthGenerator lastDayOfMonthGenerator = new LastDayOfMonthGenerator();
        String numberOfMonthsToAdd = "1";
        String lastDayOfMonth = lastDayOfMonthGenerator.calculateLastDayOfMonth(numberOfMonthsToAdd);
        System.out.println("Last day of the month: " + lastDayOfMonth);

        // *** RegonGenerator ***
        String randomRegon = RegonGenerator.generateRegon();
        System.out.println("Generated REGON number: " + randomRegon);

        // *** NipNumberGenerator ***
        NipNumberGenerator nipNumberGenerator = new NipNumberGenerator();
        String randomNip = nipNumberGenerator.generateNip();
        System.out.println("Generated NIP number: " + randomNip);

        // *** WorkingDayOfMonthGenerator ***
        WorkingDayOfMonthGenerator workingDayOfMonthGeneratorator = new WorkingDayOfMonthGenerator();
        String dayOfMonth = "16";
        String workingDayOfMonth = workingDayOfMonthGeneratorator.calculateWorkingDayOfMonth(dayOfMonth);
        System.out.println("Working day of the month for day " + dayOfMonth + " is: " + workingDayOfMonth);

        // *** WorkingDayOfMonthGenerator ***
        NumberGenerator numberGenerator = new NumberGenerator();
        // Integer
        String firstIntegerNumber = numberGenerator.generate("Integer");
        System.out.println("firstIntegerNumber: " + firstIntegerNumber);
        String secondIntegerNumber = numberGenerator.generate("Integer", "50");
        System.out.println("secondIntegerNumber: " + secondIntegerNumber);
        String thirdIntegerNumber = numberGenerator.generate("Integer", "1", "10");
        System.out.println("thirdIntegerNumber: " + thirdIntegerNumber);

        // Decimal
        String firstDoubleNumber = numberGenerator.generate("Decimal");
        System.out.println("firstDoubleNumber: " + firstDoubleNumber);
        String secondDoubleNumber = numberGenerator.generate("Decimal", "12.56");
        System.out.println("secondDoubleNumber: " + secondDoubleNumber);
        String thirdDoubleNumber = numberGenerator.generate("Decimal", "1.00", "5.55");
        System.out.println("thirdDoubleNumber: " + thirdDoubleNumber);

        // Error
        String errorIntegerNumber = numberGenerator.generate("AAA");
        String errorDoubleNumber = numberGenerator.generate("Opp", "1.00", "5.55");
    }
}

