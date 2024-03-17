package generators;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

/**
 * Calculate last day of month. User can enter the number of months to add
 */

public class LastDayOfMonthGenerator {

    public String calculateLastDayOfMonth(String numberOfMonthsToAdd) {
        long numberOfMonths = Long.parseLong(numberOfMonthsToAdd);
        LocalDate lastDayOfMonth = LocalDate.now(Clock.system(ZoneId.of("Europe/Warsaw")))
                .plusMonths(numberOfMonths)
                .with(TemporalAdjusters.lastDayOfMonth());

        return lastDayOfMonth.toString();
    }
}

