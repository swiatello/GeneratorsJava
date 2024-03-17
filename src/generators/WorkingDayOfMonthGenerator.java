package generators;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;

public class WorkingDayOfMonthGenerator {
    private final ZoneId defaultZoneId = ZoneId.systemDefault();
    private final Clock clock = Clock.system(defaultZoneId);
    public String calculateWorkingDayOfMonth(String dayOfMonth){
        int dayNumber = Integer.parseInt(dayOfMonth);
        LocalDate date = LocalDate.ofInstant(clock.instant(), defaultZoneId)
                .withDayOfMonth(dayNumber);
        
        LocalDate workingDay;
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (DayOfWeek.SUNDAY.equals(dayOfWeek)){
            workingDay = date.plusDays(1);
        } else if (DayOfWeek.SATURDAY.equals(dayOfWeek)) {
            workingDay = date.plusDays(2);
        }else {
            workingDay = date;
        }
        return workingDay.toString();
    }
}

