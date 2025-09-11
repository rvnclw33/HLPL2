import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if ( line.isEmpty()) continue;

            // split input by semicolon
            String[] parts = line.split(";");
            if ( parts.length != 4) continue;

            // parse fields
            String name = parts[0];
            String city = parts[1];
            int runways = Integer.parseInt(parts[2]);
            int time = Integer.parseInt(parts[3]);

            // Airport object
            Airport airport = new Airport(name, city, runways, time);

            // print output
            System.out.println(airport.format());
        }
    }
}
