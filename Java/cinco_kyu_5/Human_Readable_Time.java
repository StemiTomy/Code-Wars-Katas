package cinco_kyu_5;

/*
Write a function, which takes a non-negative integer (seconds)
 as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
*/

public class Human_Readable_Time {
    // mi solución:
    public class HumanReadableTime {
        public static String makeReadable(int seconds) {
            // primer hora, luego mins, y luego seconds
            int HH = (seconds / 3600);
            seconds -= (HH * 3600);

            int MM = (seconds / 60);
            seconds -= (MM * 60);

            int SS = seconds;

            String hora = String.format("%02d" + ":" + "%02d" + ":" + "%02d", HH, MM, SS);
            return hora;
        }

        // la mejor solución!
        public static String makeReadable2(int seconds) {
            return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
        }
    }
}
