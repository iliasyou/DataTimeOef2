package be.intecbrussel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEnTime {
    public static void main(String[] args) {
//Bij deze oefening gaan we gebruik maken van de volgende classes LocalDateTime, DateTimeFormatter enChronoUnit.
// Print huidige tijd uit.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//print nu een tijd in de toekomst uit.
        LocalDateTime NextTime = LocalDateTime.of(2025, 3, 6, 11, 30);
        System.out.println(NextTime);


// Gebruik de huidige tijd en zorg dat deze 3 jaar verder komt testaan.
        System.out.println(localDateTime.plusYears(3));

// Bereken het verschil tussen deze 2 tijden: jaren, maanden, dagen, uren, minuten, secondes.
// Formateer deze 2 tijden als strings met dit patroon: "yyyy-MM-dd HH:mm:ss".

          DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myformateday = localDateTime.format(format);
        System.out.println(myformateday);


    }
}
