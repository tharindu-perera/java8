package java_Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDate {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        ZoneId zone3= ZoneId.of(ZoneId.SHORT_IDS.get("IST"));
        System.out.println(zone1.getRules());//ZoneRules[currentStandardOffset=+01:00]
        System.out.println(zone2.getRules());//ZoneRules[currentStandardOffset=-03:00]
        System.out.println(zone3.getRules());//ZoneRules[currentStandardOffset=-03:00]
        LocalDateTime now1 = LocalDateTime.now(zone1);//2019-02-02T16:04:55.277
        LocalDateTime now2 = LocalDateTime.now(zone2);//2019-02-02T13:04:55.289
        LocalDateTime now3 = LocalDateTime.now(  );//2019-02-02T20:34:55.295
        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(new Date() );//Sat Feb 02 20:34:55 IST 2019


        // format ISO date time (2014-02-20T20:04:05.867)
        String asIsoDateTime = now3.format(DateTimeFormatter.ISO_DATE_TIME);//2019-02-02T20:34:55.295

        System.out.println(asIsoDateTime);

    }
}
