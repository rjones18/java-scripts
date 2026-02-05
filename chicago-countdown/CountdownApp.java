import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CountdownApp {

    // Set your target move date/time here (Chicago time).
    // Example: March 15, 2026 at 9:00 AM in America/Chicago
    private static final ZoneId CHICAGO_TZ = ZoneId.of("America/Chicago");
    private static final ZonedDateTime MOVE_DATE = ZonedDateTime.of(
            2026, 3, 15,
            9, 0, 0, 0,
            CHICAGO_TZ
    );

    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEE, MMM d yyyy 'at' h:mm a z");

        while (true) {
            ZonedDateTime now = ZonedDateTime.now(CHICAGO_TZ);
            Duration remaining = Duration.between(now, MOVE_DATE);

            if (remaining.isZero() || remaining.isNegative()) {
                System.out.println("🎉 It's move time! Welcome to Chicago!");
                break;
            }

            long totalSeconds = remaining.getSeconds();
            long days = totalSeconds / 86400;
            long hours = (totalSeconds % 86400) / 3600;
            long minutes = (totalSeconds % 3600) / 60;
            long seconds = totalSeconds % 60;

            // Clear the line + print updated countdown
            System.out.print("\r");
            System.out.print("🏙️ Moving to Chicago on " + MOVE_DATE.format(fmt) + " | " +
                    days + "d " + hours + "h " + minutes + "m " + seconds + "s remaining   ");
            System.out.flush();

            Thread.sleep(1000);
        }
    }
}
